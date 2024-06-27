import java.util.*;

public class LetterChanges {
    public static String letterChanges(String str) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char nextChar;

            // Check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                // If the current character is 'z', wrap around to 'a'
                if (currentChar == 'z') {
                    nextChar = 'a';
                } else if (currentChar == 'Z') {
                    // If the current character is 'Z', wrap around to 'A'
                    nextChar = 'A';
                } else {
                    // Otherwise, get the next character in the alphabet
                    nextChar = (char) (currentChar + 1);
                }

                // Capitalize the vowel characters in the modified string
                if (nextChar == 'a' || nextChar == 'e' || nextChar == 'i' || nextChar == 'o' || nextChar == 'u') {
                    nextChar = Character.toUpperCase(nextChar);
                }
            } else {
                // If the current character is not a letter, keep it unchanged
                nextChar = currentChar;
            }

            // Append the modified character to the result string
            modifiedString.append(nextChar);
        }

        return modifiedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Modified string: " + letterChanges(input));
        scanner.close();
    }
}
