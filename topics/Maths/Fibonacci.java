// Input -> 5
// Output -> 0 1 1 2 3 5 

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        if (n == 0)
            System.out.println(0);

        int fib[] = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("The fibonacci series upto " + n + "th term is: ");
        for (int i = 0; i <= n; i++)
            System.out.print(fib[i] + " ");
    }
}