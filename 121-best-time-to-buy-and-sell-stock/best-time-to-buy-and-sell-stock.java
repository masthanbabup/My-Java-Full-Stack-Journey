class Solution {
    public int maxProfit(int[] prices) {
        int temp=0;
        int temp2=prices[0];
        int i=0;
        int j=0;
        int max=0;
        int min=0;
        for(i=1;i<prices.length;i++){
            if(prices[i]<temp2){
                temp2=prices[i];
                
            }else{
                temp=Math.max(temp,prices[i]-temp2);
            }
        }return temp;
        
    }
}