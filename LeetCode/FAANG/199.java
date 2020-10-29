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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        if(root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i=0; i < size; i++){

                TreeNode temp = queue.remove();

                if(i == size-1)
                    list.add(temp.val);

                if(temp.left != null)
                    queue.add(temp.left);

                if(temp.right != null)
                    queue.add(temp.right);
            }
        }

        return list;
    }
}
