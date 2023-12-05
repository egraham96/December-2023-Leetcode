// Approach: Sentinel Node
class removeLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }
      
        ListNode prev = head;
        ListNode next = head;

        while (next != null) {
            if (next.val == val) {
                prev.next = next.next;
                next = next.next;
            } else {
                prev = next;
                next = next.next;
            }
        }
        return head;
    }
}

// Time Complexity: Time complexity: O(n), it's one pass solution.

// Space complexity: O(1), it's a constant space solution.