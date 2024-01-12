
/*
    Time complexity: O(1)
    Space complexity: O(1).
*/
import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        Swap2Numbers obj = new Swap2Numbers();
        obj.swapNumber(null, null);
    }

    // LeetCode Solution
    public void swapNumber(int[] a, int[] b) {
        a[0] = a[0] + b[0];
        b[0] = a[0] - b[0];
        a[0] = a[0] - b[0];
    }

    // 1. Swap using third variable
    public void swap1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), temp;
        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
        sc.close();
    }

    // 2. Swap without using third variable
    public void swap2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
        sc.close();
    }

    // 3. Single Statement
    public void swap3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        b = a + b - (a = b);

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
        sc.close();
    }

    // 4. Using XOR
    public void swap4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
        sc.close();
    }

    // 5. Using multiplication and division
    public void swap5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swapping\na = " + a + "\nb = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After Swapping\na = " + a + "\nb = " + b);
        sc.close();
    }
}