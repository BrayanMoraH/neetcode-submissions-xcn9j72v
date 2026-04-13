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
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!(queue.isEmpty())){
            int maxValue = 0;

            for(int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();

                if(node != null){
                    maxValue = Math.max(node.val, maxValue);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }

            if(maxValue != 0){
                result.add(maxValue);
            }
        }

        return result;
    }
}
