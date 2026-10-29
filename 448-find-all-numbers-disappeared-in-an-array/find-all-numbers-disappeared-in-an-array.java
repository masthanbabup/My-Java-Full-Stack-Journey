import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List <Integer> list=new ArrayList<>();
        int len=nums.length;
        Hashtable<Integer, Integer> freq = new Hashtable<>(len);

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= len; i++) {
            if (!freq.containsKey(i)) {
                list.add(i);
            }
        }return list;

        
    }
}