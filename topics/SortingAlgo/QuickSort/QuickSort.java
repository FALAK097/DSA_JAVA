import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class QuickSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();

        arr = quickSort(arr);

        System.out.println("After Using QuickSort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(arr.size() / 2);
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (Integer num : arr) {
            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                equal.add(num);
            }
        }

        less = quickSort(less);
        greater = quickSort(greater);

        less.addAll(equal);
        less.addAll(greater);
        return less;
    }
}
