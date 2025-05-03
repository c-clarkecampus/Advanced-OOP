public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.insert(6);
        binarySearchTree.insert(1);

        binarySearchTree.inorder();
    }
}
