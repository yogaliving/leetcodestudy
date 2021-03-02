package practice.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class findMode1 {
    HashMap<Integer,Integer> map = new HashMap();
    ArrayList<Integer> list  = new ArrayList();
    int max = 0;
    public int[] findMode(TreeNode root) {
        findMode2(root);
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if(max<map.get(list.get(i))) max = map.get(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if(max==map.get(list.get(i))) count++;
        }
        int [] a = new int[count];
        int b=0;
        for (int i = 0; i < list.size(); i++) {
            if(max==map.get(list.get(i))) {
                a[b] =list.get(i);
                b++;
            }
        }
        return a;
    }

    public void findMode2(TreeNode root) {
        if(root==null) return;
        if(!map.containsKey(root.val)) {
            System.out.println(map.containsValue(root.val));
            map.put(root.val, 1);
            list.add(root.val);
        }
        else {
            map.put(root.val,map.get(root.val)+1);
        }
        findMode(root.left);
        findMode(root.right);
    }

    @Test
    public void test(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.right=new TreeNode(2);
        treeNode.right.left=new TreeNode(2);
        findMode(treeNode);
    }

      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
