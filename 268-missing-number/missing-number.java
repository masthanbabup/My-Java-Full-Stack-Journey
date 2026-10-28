class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum=0;
        int res=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            
        }
        for(int i=0;i<=l;i++){
            res+=i;
            
        }
        return res-sum;
        
    }
}