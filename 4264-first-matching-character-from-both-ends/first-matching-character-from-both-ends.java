class Solution {
    public int firstMatchingIndex(String s) {
        int l=0;
        int r=s.length()-1;
        int ans=1000;
        if(s.length()==1) return 0;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                ans=l;
                break;

            }else{
                l++;
                r--;
            }
            
        }
       if(ans==1000){
        return -1;
       }
       return ans;
    }
}