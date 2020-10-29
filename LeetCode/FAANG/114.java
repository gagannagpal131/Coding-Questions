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
    public void flatten(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        getQueue(root, queue);

        boolean isRoot = true;
        TreeNode temp = null;

        while(!queue.isEmpty()){

            if(isRoot){

                root = queue.remove();
                root.left = null;
                temp = root;
                isRoot = false;

            } else {

                temp.right = queue.remove();
                temp = temp.right;
                temp.left = null;
            }
        }
    }

    private void getQueue(TreeNode node, Queue<TreeNode> queue){

        if(node == null)
            return;

        queue.add(node);
        getQueue(node.left, queue);
        getQueue(node.right, queue);
    }
}
  
