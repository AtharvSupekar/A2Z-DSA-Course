class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        dummy_head = ListNode(0)
        current = dummy_head
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            total_sum = val1 + val2 + carry

            new_digit = total_sum % 10

            carry = total_sum // 10

            current.next = ListNode(new_digit)

            current = current.next

            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return dummy_head.next
    
    def print_list(self, head: ListNode) -> list:
        """Helper function to convert a linked list to a Python list for printing"""
        result = []
        while head:
            result.append(head.val)
            head = head.next
        return result

# Example Usage: l1 = [2,4,3], l2 = [5,6,4]
l1 = ListNode(2, ListNode(4, ListNode(3)))
l2 = ListNode(5, ListNode(6, ListNode(4)))
sol = Solution()
result_list = sol.addTwoNumbers(l1, l2)



