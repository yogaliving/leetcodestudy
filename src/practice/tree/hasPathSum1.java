package practice.tree;

public class hasPathSum1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        if ((root.val+hasPathSum2(root.left,sum-root.val))==sum) return true;
        if ((root.val+hasPathSum2(root.right,sum-root.val))==sum) return true;
        else return false;
    }

    public int hasPathSum2(TreeNode root, int sum) {
        if (root==null)  return 0;
        if ((root.val+hasPathSum2(root.left,sum-root.val))==sum) return sum;
        else return root.val+hasPathSum2(root.right,sum-root.val);
    }
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
