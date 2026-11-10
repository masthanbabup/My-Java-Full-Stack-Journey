class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int p1=0;
        int p2=0;
        String res="";
        while(p1<l1 && p2<l2){
            res+=word1.charAt(p1);
            p1++;
            res+=word2.charAt(p2);
            p2++;

        }while(p1<l1){
            res+=word1.charAt(p1);
            p1++;
        }while(p2<l2){
            res+=word2.charAt(p2);
            p2++;
        }return res;

    }
}