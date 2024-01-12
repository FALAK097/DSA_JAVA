import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateArrayByKplaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter the number of rotations (k): ");
        int k = sc.nextInt();

        rotateArray(arr, k);

        System.out.println("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;

        // Temporary array to store the elements to be rotated
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr.get(i);
        }

        // Shift the remaining elements to the left
        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        // Copy back the rotated elements from the temporary array
        for (int i = n - k; i < n; i++) {
            arr.set(i, temp[i - (n - k)]);
        }

        return arr;
    }
}
