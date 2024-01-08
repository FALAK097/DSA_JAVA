import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        // Check if the last element is a duplicate
        if (nums[i] == nums[n - 1]) {
            i--;
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int newSize = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
