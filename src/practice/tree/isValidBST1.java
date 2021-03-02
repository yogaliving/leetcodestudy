package practice.tree;

/**
 * 98
 */
public class isValidBST1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }
    boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root==null) return true;
        if(min!=null&&min.val>=root.val) return false;
        if(max!=null&&max.val<=root.val) return false;
        return isValidBST(root.left,min,root) && isValidBST(root.right, root, max);
    }

    int min = Integer.MIN_VALUE;
    boolean flag = true;
    public boolean isValidBST2(TreeNode root) {
        if(root==null) return true;
        isValidBST2(root.left);
        if (root.val>min){
            min = root.val;
        }else
            flag = false;
        isValidBST2(root.right);
        return flag;
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
