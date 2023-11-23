import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Original array: ");
        printArray(array);

        System.out.println("Reversed array: ");
        reverse(array, 0);
        printArray(array);
    }

    public static void reverse(int[] arr, int index) {
        if (index < arr.length / 2) {
            int[] temp = { arr[index] };
            arr[index] = arr[arr.length - index - 1];
            arr[arr.length - index - 1] = temp[0];
            reverse(arr, index + 1);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
