package practice.tree;

import java.lang.reflect.Array;
import java.util.*;

public class findSecondMinimumValue {

    Set list = new HashSet();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null||root.left==null||root.left==root.right) return -1;
        findVal(root);
        if(list.size()==1) return -1;
        int size = list.size();
        int[] a = new int[size];
        Iterator iter = list.iterator();
        int i=0;
        while (iter.hasNext()) {
            a[i] = (int)iter.next();
            i++;
        }

        Arrays.sort(a);
        return a[1];
    }
    private void findVal(TreeNode treeNode ){
        if(treeNode==null) return ;
        list.add(treeNode.val);
        findVal(treeNode.left);
        findVal(treeNode.right);
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
