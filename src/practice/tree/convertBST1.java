package practice.tree;

/**
 * 538
 */
public class convertBST1 {
    int sum =0;
    public TreeNode convertBST(TreeNode root) {
        findSum(root);
        return root;
    }

    private void findSum(TreeNode treeNode){
        if(treeNode==null) return;
        findSum(treeNode.right);
        sum=sum+treeNode.val;
        treeNode.val=sum;
        findSum(treeNode.left);

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
