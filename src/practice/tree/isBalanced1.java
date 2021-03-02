package practice.tree;

public class isBalanced1 {

    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        isBalancedcount(root);
        return flag;
    }
    public int isBalancedcount(TreeNode root) {
        if (root==null) return 0;
        int left = isBalancedcount(root.left);
        int right= isBalancedcount(root.right);
        if (Math.abs(left-right)>1) flag = false;
        return Math.max(left,right) +1;
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
