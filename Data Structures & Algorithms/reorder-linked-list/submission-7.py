# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        slow = head
        fast = head


        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

        reversed_list = self.reverseLinkedList(slow.next)
        slow.next = None

        current = head

        while reversed_list is not None:
            temp_reversed = reversed_list.next
            temp = current.next

            current.next = reversed_list
            reversed_list.next = temp

            current = temp
            reversed_list = temp_reversed
        


    
    def reverseLinkedList(self, head: ListNode) -> ListNode:

        prev = None
        current = head

        while current is not None:
            temp = current.next
            current.next = prev
            prev = current
            current = temp

        return prev;
        
