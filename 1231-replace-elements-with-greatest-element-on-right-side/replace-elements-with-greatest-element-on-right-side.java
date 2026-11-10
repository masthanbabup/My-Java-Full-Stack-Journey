class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=i+1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }

            }res[i]=arr[max];
        }
            res[arr.length-1]=-1;
        return res;
    }
}