
/*class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long maxsum = 0;

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();
            long sum = 0;

            for (int j = i; j < i + k; j++) {

                set.add(nums[j]);
                sum += nums[j];
            }

            if (set.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}*/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        long maxsum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right])) {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if (right - left + 1 > k) {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            if (right - left + 1 == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}


