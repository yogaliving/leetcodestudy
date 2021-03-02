package practice.tree;

public class diameterOfBinaryTree1 {
    int x =0;
    public int diameterOfBinaryTree(TreeNode root) {
        return depth(root);
    }
    public int depth(TreeNode node) {
        if (node == null) {
            return 0; // 访问到空节点了，返回0
        }
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
         x = Math.max(x,L+R+1);
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
