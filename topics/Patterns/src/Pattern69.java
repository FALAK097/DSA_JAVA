public class Pattern69 {
    public static void main(String[] args) {
        pattern82(4);
    }

    static void pattern69(int n) {
        for (int row = 1; row <= n; row++) {
            // space
            for (int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }

            // star
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            // space
            for (int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }

    static void pattern70(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row;
            if (row > n) {
                stars = 2 * n - row;
            }
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern71(int n) {
        int start = 1;
        for (int row = 0; row < n; row++) {
            if (row % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int col = 0; col <= row; col++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern72(int n) {
        int space = 2 * (n - 1);
        for (int row = 1; row <= n; row++) {
            // numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // space
            for (int col = 1; col <= space; col++) {
                System.out.print(" ");
            }

            // numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            space -= 2;
            System.out.println();
        }
    }

    static void pattern73(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    static void pattern74(int n) {
        for (int row = 1; row <= n; row++) {
            for (char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern75(int n) {
        for (int row = 0; row < n; row++) {
            for (char ch = 'A'; ch <= 'A' + (n - row - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern76(int n) {
        for (int row = 0; row < n; row++) {
            char ch = (char) ('A' + row);
            for (int col = 0; col <= row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern77(int n) {
        for (int row = 0; row < n; row++) {
            // space
            for (int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }

            // character
            char ch = 'A';
            int breakpoint = (2 * row + 1) / 2;
            for (int col = 1; col <= 2 * row + 1; col++) {
                System.out.print(ch);
                if (col <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // space
            for (int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern78(int n) {
        for (int row = 0; row < n; row++) {
            for (char ch = (char) ('E' - row); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern79(int n) {
        int space = 0;
        for (int row = 0; row < n; row++) {
            // stars
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }
            // spaces
            for (int col = 0; col < space; col++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        space = 2 * n - 2;
        for (int row = 1; row <= n; row++) {
            // stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // spaces
            for (int col = 0; col < space; col++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }

    static void pattern80(int n) {
        int space = 2 * n - 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row;
            if (row > n)
                stars = 2 * n - row;
            // stars
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            // spaces
            for (int col = 1; col <= space; col++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            if (row < n)
                space -= 2;
            else
                space += 2;
            System.out.println();
        }
    }

    static void pattern81(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern82(int n) {
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int top = row;
                int left = col;
                int right = 2 * (n - 1) - col;
                int bottom = 2 * (n - 1) - row;
                System.out.print(n - (Math.min(Math.min(top, bottom), Math.min(left, right))));
            }
            System.out.println();
        }
    }

}
