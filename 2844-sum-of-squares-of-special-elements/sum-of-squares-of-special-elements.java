class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int j=0;
        int mul=1;
        int res=0;
        for(int i=0;i<l;i++){
            if(l%(i+1)==0){
                mul=nums[i]*nums[i];
                res+=mul;

            }

        }return res;
        
    }
}