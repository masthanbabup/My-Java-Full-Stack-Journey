/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode t1, ListNode t2) {

        ListNode ans = new ListNode(0);


        int sum =0;
        int carry =0;


        ListNode t3 = ans;

        while(t1!= null || t2 != null || carry!=0){

            sum += carry;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
                
            }

            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
                
            }


            carry = sum /10;

            t3.next = new ListNode(sum%10);
            sum =0;
            t3 = t3.next;
            

        }
        return ans.next;
        
    }
}