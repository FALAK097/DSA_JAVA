// Time Complexity :  O(n*N) 
// Space Complexity : O(1) 

// Optimal Solution in LeetCode : https://leetcode.com/problems/missing-number/
import java.util.*;

// public class MissingNumber {
//     public static int missingNumber(int[] a, int N) {
//         // Outer loop that runs from 1 to N:
//         for (int i = 1; i <= N; i++) {
//             // flag variable to check if an element exists
//             int flag = 0;

//             // Search the element using linear search:
//             for (int j = 0; j < N - 1; j++) {
//                 if (a[j] == i) {
//                     // i is present in the array:
//                     flag = 1;
//                     break;
//                 }
//             }

//             // check if the element is missing i.e., flag == 0:
//             if (flag == 0)
//                 return i;
//         }

//         // The following line will never execute.
//         // It is just to avoid warnings.
//         return -1;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array: ");
//         int N = sc.nextInt();
//         System.out.println("Enter the elements of the array: ");
//         int[] a = new int[N];
//         for (int i = 0; i < N; i++) {
//             a[i] = sc.nextInt();
//         }
//         int ans = missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//         sc.close();
//     }
// }

// Better Solution: 

// Time Complexity :  O(N) + O(N)
// Space Complexity : O(N)
// Hashing Solution 
public class MissingNumber {
    public static int missingNumber(int[] a, int N) {
        // Create a HashSet to store the elements of the array
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        for (int i = 0; i < N; i++) {
            set.add(a[i]);
        }

        // Check for the missing number from 1 to N
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
        sc.close();
    }
}
