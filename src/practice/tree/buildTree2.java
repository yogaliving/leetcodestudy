package practice.tree;

/**
 * 106
 */
public class buildTree2 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder, 0, postorder.length - 1,inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int postStart , int postLast, int[] inorder , int inStart  , int inLast) {
        if(postStart>postLast) return null;
        int rootVal = postorder[postLast]; //后序遍历的最后一个值是根节点
        int index = 0;
        for (int i = 0; i <inorder.length ; i++) {
            if (inorder[i]==rootVal)
                index = i;
        }//找到根节点在中序遍历里面的位置
        TreeNode root = new TreeNode(rootVal);

        int rlen = inLast -index;

        root.left =  build(postorder,postStart,postLast-rlen-1,
                inorder, inStart ,index-1);
        root.right =  build(postorder,postLast-rlen,postLast-1,
                inorder,index+1,inLast);
        return root;
    }

    private class TreeNode {
        int val;
        buildTree2.TreeNode left;
        buildTree2.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


}
