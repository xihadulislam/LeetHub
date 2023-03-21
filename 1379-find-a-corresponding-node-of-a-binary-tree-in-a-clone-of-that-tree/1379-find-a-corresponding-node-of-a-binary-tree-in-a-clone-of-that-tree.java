/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
         if (cloned == target) return cloned;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(cloned);
        while (!queue.isEmpty()) {
            
            TreeNode node = queue.poll();
            
            if (node == null) continue;
             
            if (node.val == target.val) return node;
            queue.add(node.left);
            queue.add(node.right);
            
        }

        return null;
    }
}