class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int j=0;
        int mul=1;
        int res=0;
        for(int i=1;i<=l;i++){
            if(l%i==0){
                mul=nums[j]*nums[j];
                j++;
                res+=mul;

            }else{
                j++;
            }

        }return res;
        
    }
}