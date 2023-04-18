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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode ans = new ListNode();

        List<Integer> queue = new LinkedList<>();

        ListNode upNode = head;

        while (upNode != null ) {
            queue.add(upNode.val);
            upNode = upNode.next;
        }
      //  System.out.println(queue);

        int sum = 0;
        ListNode current = ans;
        for (int val : queue) {
            sum += val;
            if (val == 0 && sum > 0) {
                ListNode c = new ListNode(sum);
                current.next = c;
                sum = 0;
                current = c;
            }
        }

        return ans.next;
        
    }
}