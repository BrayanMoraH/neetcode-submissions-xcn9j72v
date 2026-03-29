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
            int result = l1.val + l2.val + carry;
            carry = 0;

            if(result > 9){
                carry = result / 10;
                result = result % 10; 
            }

            current.next = new ListNode(result);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l2 != null){
            int result = l2.val + carry;
            carry = 0;

            if(result > 9){
                carry = result / 10;
                result = result % 10;
            }

            current.next = new ListNode(result);
            current = current.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int result = l1.val + carry;
            carry = 0;

            if(result > 9){
                carry = result / 10;
                result = result % 10;
            }

            current.next = new ListNode(result);
            current = current.next;
            l1 = l1.next;
        }

        while(carry > 0){
            int result = carry;
            carry = 0;

            if(result > 9){
                carry = result / 10;
                result = result % 10; 
            }

            current.next = new ListNode(result);
            current = current.next;
        }

        return dummy.next;
    }
}
