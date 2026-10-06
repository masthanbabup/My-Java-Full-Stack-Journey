class Solution {
    public int[] sortArrayByParity(int[] nums) {
        /*int[] res=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                res[right]=nums[i];
                right--;
            }else{
                res[left]=nums[i];
                left++;
            }
        }return res;*/
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(left<=right){
                if((nums[left]%2!=0)&& (nums[right]%2==0)){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                right--;
            }else if((nums[left]%2==0) && (nums[right]%2==0) || (nums[left]%2==0) && (nums[right]%2!=0)  ){
                left++;
            }else if((nums[left]%2!=0) && (nums[right]%2!=0)){
                right--;
            }

            }else{
                break;
            }
            

        }return nums;

    }
}