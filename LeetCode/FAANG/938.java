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

    int sum;

    public Solution(){
        this.sum = 0;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        findSum(root, L, R);
        return sum;
    }

    private void findSum(TreeNode node, int L, int R) {

        if(node == null)
            return;

        if (L <= node.val && node.val <= R)
            sum = sum + node.val;

        if(L < node.val)
            findSum(node.left, L, R);

        if(R > node.val)
            findSum(node.right, L, R);
    }
}
