import java.util.*;
import java.io.*;
import java.util.Scanner;

class PrintDivisors {
    public static void printDivisor(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                l.add(i);
                if ((n / i) != i) {
                    l.add(n / i);
                }
            }
        }
        Collections.sort(l);
        for (int j = 0; j < l.size(); j++) {
            System.out.print(l.get(j) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print its divisors: ");
        int n = sc.nextInt();
        PrintDivisors.printDivisor(n);
        sc.close();
    }
}