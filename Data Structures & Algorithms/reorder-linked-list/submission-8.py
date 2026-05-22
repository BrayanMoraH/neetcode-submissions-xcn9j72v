# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        reversed_list = self.reverse(slow.next)
        slow.next = None

        current = head

        while reversed_list:
            tmp1 = reversed_list.next
            tmp2 = current.next

            current.next = reversed_list
            reversed_list.next = tmp2


            current = tmp2
            reversed_list = tmp1

    
    def reverse(self, head):
        prev = None
        current = head

        while current:
            temp = current.next
            current.next = prev
            prev = current
            current = temp
        
        return prev