public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(maxConsecutiveOne(nums));
    }

    public static int maxConsecutiveOne(int[] nums) {
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }
}
