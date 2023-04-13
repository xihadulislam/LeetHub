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

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode ans = new ListNode();
        
         Queue<ListNode>q1 = new LinkedList();
        
        if(l1!=null) q1.add(l1);
        
       StringBuilder f = new StringBuilder();
        
      while(!q1.isEmpty()){
         ListNode currentNode =   q1.poll();
             f.append(currentNode.val);
         if(currentNode.next!=null) q1.add(currentNode.next);
         
        }
        
     //   System.out.println(f.reverse());
        
        
        Queue<ListNode>q2 = new LinkedList();
        
        if(l2!=null) q2.add(l2);
        
       StringBuilder s = new StringBuilder();
        
      while(!q2.isEmpty()){
         ListNode currentNode =   q2.poll();
             s.append(currentNode.val);
         if(currentNode.next!=null) q2.add(currentNode.next);
         
        }
        
      //  System.out.println(s.reverse());
        
         StringBuilder sum = new StringBuilder();
        
        BigInteger big = new BigInteger(f.reverse().toString());
        
        BigInteger big2 = new BigInteger(s.reverse().toString());
        
        sum.append(big.add(big2)).reverse();
        
    
      //  System.out.println(sum);
        
        if(sum.length()>0) 
        ans.val= Integer.valueOf(sum.charAt(0)+"");
        
        ListNode upNode = ans;
        
        for(int i=1;i<sum.length();i++){
            ListNode cr = new ListNode();
            cr.val = Integer.valueOf(sum.charAt(i)+"");
            upNode.next = cr;
            upNode = cr;
        }
        
        
        return ans;
    }
}