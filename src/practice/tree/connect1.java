package practice.tree;

public class connect1 {
    public Node connect(Node root) {
        if(root == null || root.left == null) return null;

        if(root.left!=null){
            root.left.next = root.right;
            root.left.left.next=root.left.right;
            root.left.right.next = root.right.left;
            root.right.left.next = root.right.right;
        }

        connect(root.left);
        connect(root.right);
        return root;
    }

   private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
