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
    public boolean isValidBST(TreeNode root) {
        
        return validateBST(root, null, null);

    }

    public boolean validateBST(TreeNode node, Integer max, Integer min){

        if(node == null){
            return true;

        } else if((max != null && node.val >= max) || (min != null && node.val <= min)) {

            return false;

        } else {

            return validateBST(node.left, node.val, min) || validateBST(node.right, max, node.val);
        }
    }

}
