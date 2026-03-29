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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> values = new ArrayList<>();
        serializeDfs(root, values);
        return String.join(",", values);
    }

    private void serializeDfs(TreeNode root, List<String> values){
        if(root == null){
            values.add("N");
            return;
        }

        values.add(String.valueOf(root.val));
        serializeDfs(root.left, values);
        serializeDfs(root.right, values);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] vals = data.split(",");
        int [] i = {0};
        return deserializeDfs(vals, i);
    }

    private TreeNode deserializeDfs(String [] vals, int [] i){
        if(vals[i[0]].equals("N")){
            i[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(vals[i[0]]));
        i[0]++;
        root.left = deserializeDfs(vals, i);
        root.right = deserializeDfs(vals, i);

        return root;
    }
}
