class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int p1=0;
        int p2=0;
        int res=0;
        while(p1<fruits.length){
             if(p2==baskets.length){
               // fruits[p1]=Integer.MIN_VALUE;
               res++;
                p1++;
                p2=0;
                continue;
            }
            if(fruits[p1]<=baskets[p2]){
                baskets[p2]=Integer.MIN_VALUE;
               // fruits[p1]=Integer.MIN_VALUE;
                p1++;
                p2=0;
            }
            else if(fruits[p1]>baskets[p2]){
                p2++;
            }
            
        }
        
        return res;
    }
}