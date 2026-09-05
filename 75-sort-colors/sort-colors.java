class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i<l;i++){
            if(nums[i]==0){c1++;}
            else if(nums[i]==1){c2++;}
            else {c3++;}
        }
        int index=0;
        while(c1-->0){
            nums[index]=0;
            index++;
        }
        while(c2-->0){
            nums[index]=1;
            index++;
        }
        while(c3-->0){
            nums[index]=2;
            index++;
        }
    }
}