public class ABCheck {
    public static String abCheck(String str) {
        int n = str.length();

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
