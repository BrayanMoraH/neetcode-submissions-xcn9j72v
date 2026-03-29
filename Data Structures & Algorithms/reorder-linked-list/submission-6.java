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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverseLinkedList(slow.next);
        slow.next = null;
        ListNode current = head;

        while(current != null && reversed != null){
            ListNode temp1 = current.next;
            ListNode temp2 = reversed.next;
            current.next = reversed;
            reversed.next = temp1;
            reversed = temp2;
            current = temp1;
        }
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}
