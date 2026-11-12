class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int p1=0;
        int p2=p1+n;
        int q=0;
        while(p2<nums.length && q<nums.length-1){
            res[q++]=nums[p1];
            res[q]=nums[p2];
            q++;
            p1++;
            p2++;
        }return res;
    }
}