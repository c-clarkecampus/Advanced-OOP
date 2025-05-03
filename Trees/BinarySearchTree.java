public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertHelper(root,data);
    }

    private Node insertHelper(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertHelper(root.left,data);
        } else if (data > root.data) {
            root.right = insertHelper(root.right,data);
        }
        return root;
    }

    public void inorder() {
        inorderHelper(root);
    }

    private void inorderHelper(Node root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(" " + root.data);
            inorderHelper(root.right);
        }
    }
}
