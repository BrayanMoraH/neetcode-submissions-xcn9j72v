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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!(queue.isEmpty())){
            for(int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();

                if(node != null){
                    values.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }

        Collections.sort(values);

        int result = values.get(k - 1);

        return result;
    }
}
