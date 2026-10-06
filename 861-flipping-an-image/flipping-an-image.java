class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
       for (int i = 0; i < arr.length; i++) {
        int left = 0;
        int right = arr[i].length - 1;

        while (left < right) {
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;

            left++;
            right--;
    }
}
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[i].length;k++){
                if(arr[i][k]==0){
                    arr[i][k]=1;
                }else{
                    arr[i][k]=0;
                }
            }
        }return arr;
    }
}