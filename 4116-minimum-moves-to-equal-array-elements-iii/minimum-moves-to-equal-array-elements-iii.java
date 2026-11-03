class Solution {
    public int minMoves(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> temp){
                temp = nums[i];
            }
        }
        int ans =0;
        for(int i =0; i<nums.length; i++){
            ans += temp-nums[i];

        }
        return ans;
    }
}