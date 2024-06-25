import java.util.ArrayList;

public class MergeSort {
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) // base case
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merging sorted halves
    }

    static int[] ms(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 6, 2, 5, 10, 7, 9 };

        System.out.println("Before sorting array: ");
        printArr(arr);

        ms(arr);

        System.out.println("After sorting array: ");
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
