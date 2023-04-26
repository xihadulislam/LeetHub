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
    public int pairSum(ListNode head) {
      int sum = 0;
        ListNode firstEnd = pickMiddle(head);
        ListNode secondStart = reverse(firstEnd.next);
        
        while (secondStart != null) {
          
             if ((head.val + secondStart.val) > sum) sum = head.val + secondStart.val;
           
            head= head.next;
            secondStart = secondStart.next;
        }
        return sum;
    }
    
    ListNode reverse(ListNode head) {
        ListNode perv = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tem = cur.next;
            cur.next = perv;
            perv = cur;
            cur = tem;
        }
        return perv;
    }

    ListNode pickMiddle(ListNode head) {
        ListNode h = head;
        ListNode t = head;
        while (h.next != null && h.next.next != null) {
            h = h.next.next;
            t = t.next;
        }
        return t;
    }

}