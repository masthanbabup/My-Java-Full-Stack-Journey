class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int l1=jewels.length();
        int l2=stones.length();
        int c=0;
        int j=0;
        for(int i=0;i<l2;i++){
            if(stones.charAt(i)==jewels.charAt(j)){
                c++;
            }
        }j++;
        while(j<l1){
            for(int i=0;i<l2;i++){
            if(stones.charAt(i)==jewels.charAt(j)){
                c++;
            }
        }j++;
    }return c;
}
}