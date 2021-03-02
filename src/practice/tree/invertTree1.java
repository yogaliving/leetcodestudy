package practice.tree;


public class invertTree1 {
    public TreeNode invertTree(TreeNode root) {

        if(root==null) return null;
        TreeNode tree;
        tree=root.left;
        root.left = root.right;
        root.right = tree;
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }






      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
