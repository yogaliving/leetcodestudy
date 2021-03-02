package practice.tree;

public class isCousins11 {
    int a=0;int b=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        a=x;b=y;
        isCousins(root.left, x, y);
        isCousins(root.right, x, y);
        return false;
    }

    private boolean checkCousins(TreeNode left, TreeNode right){
        if(left==null&&right==null) return false;
        if (left==null||right==null) return false;
        if (left.val==1)
        checkCousins( left.left,  left.right);
        checkCousins( right.left,  right.right);
        return false;
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
