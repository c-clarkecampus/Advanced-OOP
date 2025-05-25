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

    private void preOrderHelper(Node root) {
        if (root != null) {
            System.out.print(" " + root.data);
            inorderHelper(root.left);
            inorderHelper(root.right);
        }
    }

    private void postOrderHelper(Node root) {
        if (root != null) {
            inorderHelper(root.left);
            inorderHelper(root.right);
            System.out.print(" " + root.data);
        }
    }

    private boolean searchTree(int key, Node root) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchTree(key, root.left);
        } else if (root.data < key) {
            return searchTree(key, root.right);
        }

    }

}
