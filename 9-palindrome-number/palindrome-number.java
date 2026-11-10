class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int sum=0;
        int s=x;
        while(x>0){
            
            sum*=10;
            sum+=x%10;
            x/=10;
        }System.out.println(sum);
        return sum==s;
    }
}