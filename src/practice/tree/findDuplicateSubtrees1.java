package practice.tree;
/**
 * 652
 */

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class findDuplicateSubtrees1 {
    // 记录所有子树以及出现的次数
    HashMap<String, Integer> memo = new HashMap<>();
    // 记录重复的子树根节点
    LinkedList<TreeNode> res = new LinkedList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        findRootTree(root);
        return res;
    }

    private String findRootTree(TreeNode treeNode){
        int index=0;

        if (treeNode==null) return "#";
        String left = findRootTree(treeNode);
        String right = findRootTree(treeNode);
        int root = treeNode.val;
        String listString = left +','+right+','+root;
        index = memo.getOrDefault(listString,0);
        if (index==1){
            res.add(treeNode);
        }
        memo.put(listString,++index);
        return listString;
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
