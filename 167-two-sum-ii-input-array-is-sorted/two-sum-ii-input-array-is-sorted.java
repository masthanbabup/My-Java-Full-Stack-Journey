class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sol=new int[2];
        int l=numbers.length;
        int i=0;
        int j=l-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                sol[0]=i+1;
                sol[1]=j+1;
                break;
            }
            else if(target>sum){
                i++;

            }else{
                j--;
            }
               
            

        }return sol;
    
    }
}