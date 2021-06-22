/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return lca(root, p, q);
    }

    private TreeNode lca(TreeNode node, TreeNode p, TreeNode q){

        if(node == null)
            return null;

        if(node == p)
            return p;

        if(node == q)
            return q;

        TreeNode leftSide = lca(node.left, p, q);
        TreeNode rightSide = lca(node.right, p, q);

        if(leftSide != null && rightSide != null)
            return node;

        if(leftSide == null && rightSide != null)
            return rightSide;

        if(leftSide != null && rightSide == null)
            return leftSide;

        return null;
    }
}
