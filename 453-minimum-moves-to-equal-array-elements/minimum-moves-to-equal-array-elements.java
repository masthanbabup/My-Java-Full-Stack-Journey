class Solution {
    public int minMoves(int[] nums) {
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<temp){
                temp = nums[i];
            }
        }
        int ans =0;
        for(int i =0; i<nums.length; i++){
            ans +=Math.abs(temp-nums[i]);

        }
        return ans;
        
    }
}