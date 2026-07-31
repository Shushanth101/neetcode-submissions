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
    int maxi=0;
    public int maxDepth(TreeNode node){
        if(node==null) return 0;
        return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
    }
    public int findDiameter(TreeNode root){
        if(root!=null){
            int lh=maxDepth(root.left);
            int rh=maxDepth(root.right);
            maxi = Math.max(maxi,lh+rh);
            findDiameter(root.left);
            findDiameter(root.right);
        }
        return maxi;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return findDiameter(root);
        
    }
}
