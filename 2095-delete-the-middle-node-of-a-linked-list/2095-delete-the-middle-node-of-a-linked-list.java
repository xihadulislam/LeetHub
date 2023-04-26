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
    public ListNode deleteMiddle(ListNode head) {
         if (head == null) return head;
         if (head.next == null) return null;
        
           int size = 0;
        ListNode upNode = head;
        while (upNode != null) {
            upNode = upNode.next;
            size++;
        }
        
        
        ListNode h = head;
        ListNode t = head;
        int n=0;
        while (h.next != null && h.next.next != null) {
            h = h.next.next;
            t = t.next;
            n++;
        }
        
        if (n == size) return head.next;

        int nthIndex = size - n;
        int i = 2;
        ListNode perv = head;
        while (i < nthIndex) {
            perv = perv.next;
            i++;
        }
        
        perv.next= perv.next.next;
        
        
       // System.out.println(t.val);
      //  t.next = t.next.next;
     
        return head;
        
    }
    
    
}