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
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int value = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val  + l2.val;

            if(value != 0){
                sum += value;
                value = 0;
            }

            if(sum > 9){
                value = sum / 10;
                sum = sum % 10; 
            }

            current.next = new ListNode(sum);

            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + value;
            value = 0;

            if(sum > 9){
                value = sum / 10;
                sum = sum % 10;
            }

            current.next = new ListNode(sum);
            current = current.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + value;
            value = 0;

            if(sum > 9){
                value = sum / 10;
                sum = sum % 10;
            }

            current.next = new ListNode(sum);
            current = current.next;
            l2 = l2.next;
        }

        while(value != 0){
            int sum = 0 + value;
            value = 0;

            if(sum > 9){
                value = sum / 10;
                sum = sum % 10;
            }

            current.next = new ListNode(sum);

        }
        
        return dummy.next;
    }
}
