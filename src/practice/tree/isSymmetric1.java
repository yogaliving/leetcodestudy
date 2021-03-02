package practice.tree;

import org.junit.Test;

/**
 * 101
 */
public class isSymmetric1 {
    public boolean isSymmetric(TreeNode root) {
        return checkTree(root,root);

    }
    private  boolean  checkTree(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        return p.val==q.val&&checkTree(p.left,q.right)&&checkTree(p.right,q.left);
    }
@Test
 public void test(){
    isSymmetric1 a = new isSymmetric1();
    TreeNode root = new TreeNode(1);
    root.left= new TreeNode(2);root.right= new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.right.right = new TreeNode(3);
    System.out.println(a.isSymmetric(root));
}


    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
