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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;

        int size = 0;
        ListNode upNode = head;
        while (upNode != null) {
            upNode = upNode.next;
            size++;
        }

        if (n == size) return head.next;

        int nthIndex = size - n;
        int i = 1;
        ListNode perv = head;
        while (i < nthIndex) {
            perv = perv.next;
            i++;
        }
        
        perv.next= perv.next.next;
        
        return head;
    }
}