package practice.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 107
 */
public class levelOrderBottom1 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return null;
        levelOrder(root.left,root.right);
        list3.add(root.val);
        lists.add(list3);
        return lists;
    }

    public List<Integer> levelOrder(TreeNode p,TreeNode q) {
        if (p==null&&q==null) return null;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = levelOrder(p.left,p.right);
        list.add(p.val);list.add(q.val);
        List<Integer> list2 = levelOrder(q.left,q.right);
        list1.addAll(list2);
        lists.add(list1);
        return list;
    }


      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
