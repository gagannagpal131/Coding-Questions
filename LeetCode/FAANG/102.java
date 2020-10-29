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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){

            List<Integer> innerList = new ArrayList<Integer>();
            int size = queue.size();

            for(int i=0; i < size; i++){

                TreeNode temp = queue.remove();
                innerList.add(temp.val);

                if(temp.left != null)
                    queue.add(temp.left);

                if(temp.right != null)
                    queue.add(temp.right);
            }

            list.add(innerList);
        }

        return list;
    }
}
