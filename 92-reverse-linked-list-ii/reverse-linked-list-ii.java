class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftpre = dummy;

        // Move leftpre to the node before 'left'
        for (int i = 1; i < left; i++) {
            leftpre = leftpre.next;
        }

        // First node of the section to reverse
        ListNode currNode = leftpre.next;

        // This will become the last node after reversal
        ListNode sublistHead = currNode;

        ListNode preNode = null;

        // Reverse left to right
        for (int i = 0; i < right - left + 1; i++) {

            ListNode nextNode = currNode.next;

            currNode.next = preNode;

            preNode = currNode;

            currNode = nextNode;
        }

        // Connect the reversed part
        leftpre.next = preNode;
        sublistHead.next = currNode;

        return dummy.next;
    }
}