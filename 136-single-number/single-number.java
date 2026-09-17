class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int a = nums[i];
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (a == nums[j]) {
                    c++;
                }
            }

            if (c == 1) {
                return a;
            }
        }

        return -1;
    }
}