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
 if(root==NULL) return false;
        cur+=root->val;
        if(root->left==NULL && root->right==NULL && cur==sum) return true;
        if(rec(root->left,sum,cur) || rec(root->right,sum,cur)) return true;
        cur-=root->val;
        return false;
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int sum=0;
       return solve(root,sum,targetSum);
    }
    public boolean solve(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
        sum=sum+root.val;
        if(sum==targetSum && root.left==null && root.right==null){
                return true;
        }
        
        
        return   solve(root.left,sum,targetSum) || solve(root.right,sum,targetSum);
    }
}