/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int sum =0;
        
        Queue<TreeNode>que = new LinkedList();
        
        if(root!=null) que.add(root);
        
        
        while(!que.isEmpty()){
            
            int size = que.size();
            
            for(int i=0;i<size;i++){
                
                TreeNode currentNode = que.peek();
                
                if(currentNode.val>=low && currentNode.val<=high){
                    sum+=currentNode.val;
                }
                
                if(currentNode.left!=null) que.add(currentNode.left);
                 if(currentNode.right!=null) que.add(currentNode.right);
                
                que.poll();
                
            }
            
            
            
        }
        
        
        
        
        return sum;
        
    }
}