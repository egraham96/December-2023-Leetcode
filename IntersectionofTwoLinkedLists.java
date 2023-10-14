//Approach: Two Pointers
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
        // Note: In the case lists do not intersect, the pointers for A and B
        // will still line up in the 2nd iteration, just that here won't be
        // a common node down the list and both will reach their respective ends
        // at the same time. So pA will be NULL in that case.
    }
}

//Let n be the length of list A and m be the length of list B

// Time Complexity: O(n + m), In the worst case, each list is traversed twice giving 2m+2n, 
// which is equivalent to O(n + m). This is because the pointers firstly go down each list so that 
// they can be "lined up" and then in the second iteration, the intersection node is searched for. An interesting observation you might have 
// made is that when the lists are of the same length, this algorithm only traverses each list once. This is because the pointers are already 
// "lined up" from the start, so the additional pass is unnecessary.

//Space Complexity : O(1). We aren't allocating any additional data structures, 
//so the amount of extra space used does not grow with the size of the input. 
