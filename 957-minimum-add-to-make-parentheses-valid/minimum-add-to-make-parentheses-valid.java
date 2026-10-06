class Solution {
    public int minAddToMakeValid(String s) {
        int s1='(';
        int s2=')';
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s1){
                c1++;
            }
            else if(s.charAt(i) == ')' && c1>0){
                c1--;
            }else{
                c2++;
            }
        }
        return c2+c1;
    }
}