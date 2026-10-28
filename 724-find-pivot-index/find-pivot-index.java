class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        while(left<nums.length){
            int sleft=0;
            int sright=0;  
            for(int i=0;i<left;i++){
                sleft+=nums[i];
            }
            for(int j=left+1;j<nums.length;j++){
                sright+=nums[j];
            }
            if(sleft==sright){
                return left;
            }
            left++;
        }return -1;
    }
}