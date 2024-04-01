public class QuickSorted {
    static int pivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                arr[j] = arr[i] + arr[j] - (arr[i] = arr[j]);
            }
        }
        arr[low] = arr[j] + arr[low] - (arr[j] = arr[low]);
        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = pivot(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public static int[] quickSort(int[] arr) {
        qs(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 2, 5, 10, 7, 9 };
        System.out.println("Before Sorting: ");
        printArray(arr);

        quickSort(arr);

        System.out.println("After Sorting: ");
        printArray(arr);
    }

    static int[] printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
}
