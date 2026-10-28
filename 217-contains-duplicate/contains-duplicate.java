class Solution {
    public boolean containsDuplicate(int[] nums) {
       /* int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]==nums[right]){
                return true;
            }else{
                right--;
                if(right==left){
                    left++;
                    right=nums.length-1;
                }
            }
        }return false;*/


            HashSet<Integer> set = new HashSet<>();
            for(int num:nums){
                if(set.contains(num)){
                    return true;
                }
                else{
                    set.add(num);
                }
            }return false;
    }
}