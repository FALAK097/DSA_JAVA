public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;
        int index = linearSearch(arr, key);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
