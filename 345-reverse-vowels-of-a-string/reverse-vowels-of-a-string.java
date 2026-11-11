class Solution {
    public String reverseVowels(String s) {
        int l=s.length();
        int p1=0;
        int p2=l-1;
/*

        while(p1<=p2){
           if((s.charAt(p1)=='a'||'e'||'i'||'o'||'u'||'A'||'E'||'I'||'O'||'U') && s.charAt(p2)=='a'||'e'||'i'||'o'||'u'||'A'||'E'||'I'||'O'||'U')){
                char c=s.charAt(p1);
                s.charAt(p1)=s.charAt(p2);
                s.charAt(p2)=c;
                p1++;
                p2--;
            }else if(s.charAt(p1)!='a'||'e'||'i'||'o'||'u'||'A'||'E'||'I'||'O'||'U') && 
            
            
        }*/


        char[] chars = s.toCharArray();
    String vowels = "aeiouAEIOU";

    while (p1 < p2) {
   
         while (p1 < p2 && vowels.indexOf(chars[p1]) == -1) {
            p1++;
    }
   
        while (p1 < p2 && vowels.indexOf(chars[p2]) == -1) {
            p2--;
    }
    
   
        char c = chars[p1];
        chars[p1] = chars[p2];
        chars[p2] = c;
    
        p1++;
        p2--;
    }

    return new String(chars);



    }
}