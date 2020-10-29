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
    public boolean hasPathSum(TreeNode root, int sum) {

        return doesPathExist(root, sum);
    }
    
    private boolean doesPathExist(TreeNode node, int value){

        if(node == null)
            return false;

        if(node.left == null && node.right == null && value-node.val == 0)
            return true;

        return (doesPathExist(node.left, value-node.val) || doesPathExist(node.right, value-node.val));
    }
}
