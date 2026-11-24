class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int csum=0;
        int res=0;

        for(int i=0;i<k;i++){
            csum+=arr[i];
            
        }
        if((csum/k)>=t){
                res++;
            }
        for(int i=k;i<arr.length;i++){
            csum+=arr[i]-arr[i-k];
            if((csum/k)>=t){
                res++;
            }
        }
        return res;
    }
}