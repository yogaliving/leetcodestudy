package practice.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class kthSmallest1 {
    ArrayList<Integer> array = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        travelTree(root);
        return array.get(k);
    }

    private void travelTree(TreeNode treeNode){
        if(treeNode==null) return ;
        travelTree(treeNode.left);
        array.add(treeNode.val);
        travelTree(treeNode.right);
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
