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

    int maxSum;

    Solution(){
        maxSum = Integer.MIN_VALUE;
    }

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node){

        if(node == null)
            return 0;

        int leftSubtree = Math.max(0, dfs(node.left));
        int rightSubtree = Math.max(0,dfs(node.right));

        maxSum = Math.max(maxSum, node.val + leftSubtree + rightSubtree);

        return node.val + Math.max(leftSubtree, rightSubtree);
    }
}
