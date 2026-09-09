class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right =arr.length-1 ;
        int res=0;
        int area=0;
        while(left<right){
            area=((Math.min(arr[left],arr[right]))*(right-left));
            res=Math.max(res,area);

        if(arr[left]<arr[right]){
            left++;
        }else if(arr[left]>arr[right]){
            right--;
        }else{
            left++;
        }
        }
       return res;
         
    }
}