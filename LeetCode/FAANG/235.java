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


        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);

        if(root.val == p.val && (root.val < q.val || root.val > q.val))
            return p;

        if(root.val == q.val && (root.val < p.val || root.val > p.val))
            return q;

        if((root.val > p.val && root.val < q.val) || (root.val > q.val && root.val < p.val))
            return root;

        return null;
    }
}
