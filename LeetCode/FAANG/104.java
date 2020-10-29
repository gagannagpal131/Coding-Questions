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
    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;

        int leftSubtreeDepth = maxDepth(root.left);
        int rightSubtreeDepth = maxDepth(root.right);

        int CurrentDepth = Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;

        return CurrentDepth;
    }
}
