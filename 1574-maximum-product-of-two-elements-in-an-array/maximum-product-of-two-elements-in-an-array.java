class Solution {
    public int maxProduct(int[] nums) {
        int temp=0;
         int temp2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp){
                temp2=temp;
                temp=nums[i];

            }else if(nums[i]>temp2){
                temp2=nums[i];
            }
        }
        
        
        return ((temp-1)*(temp2-1));
    }
}