public class ABCheck {
    // Have the function ABCheck(str) take the str parameter being passed and return
    // the string true if the characters a and b are separated by exactly 3 places
    // anywhere in the string at least once
    public static String abCheck(String str) {
        int n = str.length();

        // ? why n - 4 because we need to check 4 characters ahead of a or b
        for (int i = 0; i <= n - 4; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b' || str.charAt(i) == 'b' && str.charAt(i + 4) == 'a') {
                return "true";
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        String input = "bzaaa";
        System.out.println(abCheck(input));
    }
}
