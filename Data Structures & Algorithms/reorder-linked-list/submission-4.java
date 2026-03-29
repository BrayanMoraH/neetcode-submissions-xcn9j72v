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
    public void reorderList(ListNode head) {
       ListNode slow  = head;
       ListNode fast = head;
       ListNode current = head;

       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }

       ListNode reversed = reverse(slow.next);
       slow.next = null;

       //printLinkedList(reversed);

       while(reversed != null){
        System.out.println(reversed.val);
        ListNode temp1 = current.next;
        ListNode temp2 = reversed.next;

        current.next = reversed;
        reversed.next = temp1;

        reversed = temp2;
        current = temp1;
       }


    }

    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;


        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }


    public void printLinkedList(ListNode current){
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
