class Solution {
    public int maxProduct(int[] nums) {
        int temp=0;
         int temp2=0;
        for(int i :nums){
            if(i>temp){
                temp2=temp;
                temp=i;

            }else if(i>temp2){
                temp2=i;
            }
        }
        
        
        return ((temp-1)*(temp2-1));
    }
}