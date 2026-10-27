class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] res= new int[len*2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];

        }
        for(int i=nums.length;i<res.length;i++){
            res[i]=nums[j];
            j++;
        }return res;
            

    }
}