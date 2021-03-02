package practice.tree;

/**
 * 114
 */

public class flatten {
    public void flatten1(TreeNode root) {
        flatten1(root.left);
        flatten1(root.right);
        if (root==null) return;  //递归终止的条件
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.right = left;
        root.left = null;
        TreeNode tree =root;
        while (tree.right!=null){
            tree=tree.right; //找到右边节点的最后一个节点
        }
        tree.right = right;
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

