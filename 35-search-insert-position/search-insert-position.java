class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int p1=l-1;
        int rans=0;
        if(nums[p1]<target) return l;
        for(int i=0;i<l;i++){
            if(nums[i]<target && target<=nums[i+1]){
                rans= i+1;
            }
        }return rans;
       
    }
}