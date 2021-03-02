package practice.tree;

/**
 * 105
 */

public class buildTree1 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode build(int[] preorder,int preStart ,int preLast,
                          int[] inorder ,int inStart  ,int inLast) {
        if(preStart>preLast) return null;
        int pStart = preorder[preStart] ;
        int index = 0;
        for (int i = 0; i <inorder.length ; i++) {
            if (inorder[i]==pStart)
                index = i;
        }
        TreeNode tree = new TreeNode(pStart);
        tree.left = build(preorder,preStart+1,preStart+index-inStart,
                inorder,inStart,index-1);
        tree.right= build(preorder,preStart+index-inStart+1,preLast,
                inorder,index+1,inLast);
        return tree;
    }
      private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
