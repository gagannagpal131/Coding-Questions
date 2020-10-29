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
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(s == null)
            return false;

        if(findSubTree(s,t))
            return true;

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean findSubTree(TreeNode s, TreeNode t){

        if(s == null && t == null)
            return true;

        if((s == null && t!= null) || (s != null && t == null))
            return false;

        if(s.val != t.val)
            return false;

        if(s.val == t.val)
            return findSubTree(s.left, t.left) && findSubTree(s.right, t.right);

        //Mandatory return statement required to compile
        //flow will never reach this statement as all cases are covered
        return false;
    }
}
