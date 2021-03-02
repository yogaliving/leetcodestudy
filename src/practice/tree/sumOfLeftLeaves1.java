package practice.tree;

import org.junit.Test;

public class sumOfLeftLeaves1 {
    int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        //判断节点是否是左叶子节点，如果是则将它的和累计起来
        if(root.left != null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return res;
    }

    @Test
    public void test(){

        sumOfLeftLeaves1 a = new sumOfLeftLeaves1();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        treeNode.left.left=new TreeNode(4);
        treeNode.left.right=new TreeNode(5);
        treeNode.right.left=new TreeNode(6);
        a.sumOfLeftLeaves(treeNode);

    }
      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
