class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count =0;
        int len=people.length;
        int left=0;
        int right=len-1;
        int remainder=0;
        while(left<=right){
            if(people[right]==limit){
                count++;
                right--;
            }else if(people[right]<limit){
                 remainder=limit-people[right];
                if(remainder==people[left]){
                    count++;
                    left++;
                    right--;
                }else if(remainder<people[left]){
                    count++;
                    right--;
                 
                }else if(remainder>=people[left]){
                    count++;
                    right--;
                    left++;
                }
                
            }
        }return count;
        
    }
}