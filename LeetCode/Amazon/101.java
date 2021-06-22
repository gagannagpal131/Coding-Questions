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
    public boolean isSymmetric(TreeNode root) {

        return validateTree(root, root);
    }

    private boolean validateTree(TreeNode leftNode, TreeNode rightNode){

        if(leftNode == null && rightNode == null)
            return true;

        if(leftNode == null || rightNode == null)
            return false;

        if(leftNode.val != rightNode.val)
            return false;

        return validateTree(leftNode.left, rightNode.right) && validateTree(leftNode.right, rightNode.left);
    }
}
