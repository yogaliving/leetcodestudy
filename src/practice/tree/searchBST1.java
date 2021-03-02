package practice.tree;
/**
 * 700
 */

import javax.swing.tree.TreeNode;

public class searchBST1 {
    TreeNode treeNode;
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode treeNode1;
        treeNode = new TreeNode(val);
        treeNode1 = findBST(root, val);
        if(treeNode1==null) treeNode=null;
        return treeNode;
    }

    private TreeNode findBST(TreeNode root, int val){
        if (root==null) return null;
        if (root.val==val) {
            treeNode = root;
        }
        else if(root.val>val) searchBST(root.left,val);
        else
            searchBST(root.right,val);
        return root;
    }

      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
