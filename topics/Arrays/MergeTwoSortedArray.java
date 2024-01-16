import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedArray {

    public static List<Integer> sortedArray(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n1 = a.length;
        int n2 = b.length;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(a[i]); // Add only once for common elements
                i++;
                j++;
            }
        }

        while (i < n1) {
            list.add(a[i]);
            i++;
        }

        while (j < n2) {
            list.add(b[j]);
            j++;
        }

        // Remove duplicates
        for (int k = 0; k < list.size() - 1; k++) {
            if (list.get(k).equals(list.get(k + 1))) {
                list.remove(k + 1);
                k--;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int n1 = scanner.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter the elements of the first array (in sorted order):");
        for (int i = 0; i < n1; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int n2 = scanner.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter the elements of the second array (in sorted order):");
        for (int i = 0; i < n2; i++) {
            b[i] = scanner.nextInt();
        }

        List<Integer> result = sortedArray(a, b);

        System.out.println("Union of arrays: " + result);
        scanner.close();
    }
}
