class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int p1=0;
        int p2=0;
        int res=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<=nums2[p2]){

            res=Math.max(res,p2-p1);
            p2++;
        }else{
            p1++;
        }

        }
        return res;
        
    }
}