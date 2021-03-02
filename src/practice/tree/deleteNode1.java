package practice.tree;

/**
 * 450  注意BST的性质！
 * root
 * 比root.left的任何一个节点都大
 * 比root.right的任何一个节点都小
 */
public class deleteNode1 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return null;
        if(root.val==key){
            if(root.right==null&&root.left==null) return null;
            if (root.right==null) return root.left;   //右侧为空就直接用左侧节点顶上root(本应该返回的是root)
            if(root.left==null) return root.right;
            int max = getMax(root.left);
            root.val = max;
            root.left = deleteNode(root.left,max);
        }else if (root.val>key){
            root.left = deleteNode(root.left,key);
        }else
            root.right= deleteNode(root.right,key);
        return root;
    }

    private int getMax(TreeNode treeNode){
        while (treeNode.right!=null) treeNode=treeNode.right;
        return treeNode.val;
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
