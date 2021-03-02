package practice.tree;

/**
 * 236
 * 1、这个函数是干嘛的？
 *
 * 2、这个函数参数中的变量是什么的是什么？
 *
 * 3、得到函数的递归结果，你应该干什么？
 */
public class lowestCommonAncestor2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;
        if (root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left==null&&right==null) return null;
        if (left!=null&&right!=null) return root;
        return left==null ? right :left ;
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
