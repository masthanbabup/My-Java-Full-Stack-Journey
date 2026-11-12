class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int k) {
       ArrayList<Boolean> list=new ArrayList<>();
        int temp=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[temp]){
                temp=i;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]+k >=arr[temp]){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }return list;
    }
}