class Solution {
    public int largestAltitude(int[] gain) {
        int[] res=new int[gain.length+1];
        res[0]=0;
        res[1]=gain[0];
        for(int i=2;i<res.length;i++){
            res[i]=res[i-1]+gain[i-1];
        }
        int temp=res[0];
        for(int i=0;i<res.length;i++){
            if(res[i]>temp){
                temp=res[i];
            }
        }return temp;
    }
}