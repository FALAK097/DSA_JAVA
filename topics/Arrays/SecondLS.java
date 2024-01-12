// Find the second largest and second smallest element in an array
// Time complexity : O(n)  (O(2n)) --> would be the correct time complexity as 2 instances are occuring
// Space complexity : O(1)

import java.util.Scanner;

public class SecondLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargest(n, arr);
        secondSmallest(n, arr);
        sc.close();
    }

    public static void secondLargest(int n, int arr[]) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                {
                    sLargest = arr[i];
                }
            }
        }
        System.out.println("The second largest element in the array is: " + sLargest);
    }

    public static void secondSmallest(int n, int arr[]) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        System.out.println("The second smallest element in the array is: " + sSmallest);
    }
}
