
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] mix = new int[m+n];

        int i =0;
        int j =0;
        int k =0;

        while(i<m && j< n){
            if(nums1[i]< nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{

                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            mix[k] = nums2[j];
            k++;
            j++;
        }

        for (int q = 0; q < mix.length; q++) {
            nums1[q] = mix[q];
        }  
    }
}
