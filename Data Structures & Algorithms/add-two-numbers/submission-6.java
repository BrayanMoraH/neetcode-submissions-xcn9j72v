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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1 != null && l2 != null){
            int currentValue = l1.val + l2.val;

            if(carry != 0){
                currentValue += carry; 
            }

            if(currentValue > 9){
                current.next = new ListNode(currentValue % 10);  
            }else {
                current.next = new ListNode(currentValue); 
            }

            carry = currentValue / 10; 
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int currentValue = l1.val + carry;

            if(currentValue > 9){
                current.next = new ListNode(currentValue % 10);   
            }else {
                current.next = new ListNode(currentValue);
            }

            carry = currentValue / 10;  

            l1 = l1.next;
            current = current.next;
        }

        while(l2 != null){
            int currentValue = l2.val + carry;

            if(currentValue > 9){
                current.next = new ListNode(currentValue % 10); 
            }else {
                current.next = new ListNode(currentValue); 
            }

            carry = currentValue / 10;   
            l2 = l2.next;
            current = current.next;
        }

        if(carry > 0){
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
