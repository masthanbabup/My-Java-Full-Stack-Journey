class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int r = 0; r < n; r++) {

            // Compare nums with sorted
            if (Arrays.equals(nums, sorted)) {
                return true;
            }

            // Left rotate sorted by 1
            int temp = sorted[0];

            for (int i = 1; i < n; i++) {
                sorted[i - 1] = sorted[i];
            }

            sorted[n - 1] = temp;
        }

        return false;
    }
}