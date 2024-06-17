import java.util.ArrayList;
//? why we are using ArrayList here?
//? Array is a fixed size data structure while ArrayList is a dynamic size data structure.
//? We are using ArrayList here because we don't know the number of divisors of a number in advance. 

public class PrintDivisors {
    public static ArrayList<Integer> findDivisors(int n) {
        // Initialize an empty ArrayList to store the divisors
        ArrayList<Integer> divisors = new ArrayList<>();

        // Iterate up to the square root of n to find divisors Calculate the square root
        // of n
        int sqrtN = (int) Math.sqrt(n);

        // Loop from 1 to the square root of n

        // for (int i = 1; i <= sqrtN; ++i) {
        for (int i = 1; i * i <= n; i++) {
            // Check if i divides n without leaving a remainder
            if (n % i == 0) {
                // Add divisor i to the list
                divisors.add(i);

                // Add the counterpart divisor if it's different from i
                if (i != n / i) {
                    // Add the counterpart divisor to the list
                    divisors.add(n / i);
                }
            }
        }

        // sort the divisors
        divisors.sort(Integer::compareTo);

        // Return the list of divisors
        return divisors;

    }

    public static void main(String[] args) {
        int number = 12;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}