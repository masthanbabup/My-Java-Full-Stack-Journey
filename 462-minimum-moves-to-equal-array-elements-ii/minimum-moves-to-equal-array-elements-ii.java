class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length/2;
        int mid=nums[len];
        int ans = 0;
        System.out.println(nums[len]);
        for(int i=0;i<nums.length;i++){
            ans+=Math.abs(mid-nums[i]);
        }
        return ans;
    
    }
}