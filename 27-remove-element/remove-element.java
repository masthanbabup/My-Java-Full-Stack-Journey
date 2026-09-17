class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[j]=nums[i];
                nums[j]=temp;
                j++;
            }
        }return j;
    }
}