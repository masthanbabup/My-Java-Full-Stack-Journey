/*class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        /*int mf=0;
        int ms=0;
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[mf]){
                mf=i;
            }
         }
         for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[ms] && (nums[i]!=nums[mf])) {
                ms=i;
            }
         }
         for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[res] && (nums[i]!=nums[mf]) && (nums[i]!=nums[ms])   ){
                res=i;
            }
         }return nums[res];*/
           /* int res=0;
         int l=nums.length;
         Arrays.sort(nums);
         int p1=l-1;
         int p2=l-2;
         int c=1;
         int re=0;
         for(int i=l-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                c++;
                if(c==3){
                    res=i-1;
                }
                re=i;
            }
         }if(c<3){
            return nums[re];
         }
         return nums[res];


        
    }
}*/
class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }
}