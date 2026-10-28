class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int remainder=0;
        int i=0;
        int res=0;
        int count1=0;
        while(i<nums.length){
            if(nums[i]>0){
                nums[i]=nums[i]/10;
                count++;

            }else{
                if(count%2==0 && count>0){
                    count1++;
                    i++;
                    count=0;
                }else{
                    count=0;
                    i++;
                }
            
            }
        }
            
            
        return count1;
        
    }
}