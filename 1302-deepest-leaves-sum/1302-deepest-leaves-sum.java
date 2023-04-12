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
    public int deepestLeavesSum(TreeNode root) {
        
        int cnt=0;
        int sum =0;
        
        if(root==null) return 0;
        
        Queue<TreeNode> queue = new LinkedList();
    
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            for (int i=0;i<size;i++){
            TreeNode currentNode = queue.peek();
            if(currentNode.left!=null) queue.add(currentNode.left);
            if(currentNode.right!=null) queue.add(currentNode.right);
                queue.poll();
          
            }
            cnt++;
            
        }
        
        
        Queue<TreeNode> resQ = new LinkedList();
    
        resQ.add(root);
        
        int temp=0;
        
        while(!resQ.isEmpty()){
            
            int size = resQ.size();
            
            for (int i=0;i<size;i++){
            TreeNode currentNode = resQ.peek();
            if(currentNode.left!=null) resQ.add(currentNode.left);
            if(currentNode.right!=null) resQ.add(currentNode.right);
            TreeNode finalNode =  resQ.poll();
                if(temp ==cnt-1) sum+=finalNode.val;
          
            }
            temp++;
            
        }
        
        
        
        
        
        
        return sum;
    }
}