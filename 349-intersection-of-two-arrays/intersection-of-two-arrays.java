class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] res;
        if(l1<l2){
             res=new int[l1];
        }else{
             res=new int[l2];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0;
        int p2=0;
        int i=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]>nums2[p2]){
                p2++;
            }else if(nums1[p1]<nums2[p2]){
                p1++;
            }else{
                 if (i == 0 || res[i - 1] != nums1[p1]) {
                    res[i] = nums1[p1];
                    i++;
                }
               
                
                 p1++;
                p2++;
                

            }
        }return Arrays.copyOf(res, i);
    }
}