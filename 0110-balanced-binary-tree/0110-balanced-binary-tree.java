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
     int height(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int l = 1 + height(root.left);
        int r = 1 + height(root.right);
        return Math.max(l, r);
    }

    public boolean isBalanced(TreeNode root) {
       if(root == null){
            return true;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if(Math.abs(leftheight - rightheight ) > 1){
            return false;
        }

        boolean leftAns  = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);
        
        return leftAns&&rightAns; 
    }
}