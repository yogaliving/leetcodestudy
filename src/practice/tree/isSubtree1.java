package practice.tree;

/**
 * 572 要想到找子树，就要先有子树和给定树完全一样
 */
public class isSubtree1 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t==null) return true;
        if (s==null) return false;
        return isSubtree(s.left,t)||isSubtree(s.right,t)||isSametree(s,t);
    }
    public boolean isSametree(TreeNode s, TreeNode t) {
        if(s==null&&t==null) return true;
        if (s == null || t == null) return false;
        if (s.val!=t.val) return false;
        return isSametree(s.left,t.left)&&isSametree(s.right,t.right);
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
