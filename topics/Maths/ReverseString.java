public class ReverseString {
    public static String reverseString(String str) {
        // ! Method - 1
        // String reversed = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        // reversed += str.charAt(i);
        // }
        // return reversed;

        // ! Method - 2

        char[] charArray = str.toCharArray();

        int n = charArray.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println(reverseString(input));
    }
}
