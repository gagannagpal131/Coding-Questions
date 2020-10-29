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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();

        List<Integer> innerList = new ArrayList<Integer>();

        findPath(root, sum, innerList, finalList);

        return finalList;
    }

    private void findPath(TreeNode node, int value, List<Integer> innerList, List<List<Integer>> finalList){

        if(node == null)
            return;

        innerList.add(node.val);

        if(node.right == null && node.left == null && value - node.val == 0){

            finalList.add(new ArrayList<Integer>(innerList));
            //innerList.remove(innerList.size()-1);
            //return;
        }

        findPath(node.left, value - node.val, innerList, finalList);
        findPath(node.right, value - node.val, innerList, finalList);

        innerList.remove(innerList.size()-1);
    }
}
