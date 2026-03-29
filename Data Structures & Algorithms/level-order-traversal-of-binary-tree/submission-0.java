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
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       List<List<Integer>> result = new ArrayList<>();

       while(!queue.isEmpty()){
         List<Integer> current = new ArrayList<>();
         for(int i = queue.size(); i > 0; i--){
            TreeNode currentNode = queue.poll();
            if(currentNode != null){
                current.add(currentNode.val);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
            
         }

         if(current.size() > 0){
            result.add(current);
         }
       }

       return result; 
    }
}
