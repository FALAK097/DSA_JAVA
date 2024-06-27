import java.util.Scanner;

public class LongestWord {
    public static String longestWord(String sen) {
        String[] words = sen.split("[^a-zA-Z0-9]");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(longestWord(input));
        sc.close();
    }
}
