package practice.tree;

/**
 *  104
 */
public class maxDepth1 {
    int count = 0;
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }


      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
