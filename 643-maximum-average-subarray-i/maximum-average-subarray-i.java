class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double csum=0;
   
         for(int i=0;i<k;i++){
            csum+=nums[i];
         }
         double res=csum;
         for(int i=k;i<nums.length;i++){
            csum+=nums[i]-nums[i-k];
            res=Math.max(res,csum);
         }
         return res/k;
    }
}