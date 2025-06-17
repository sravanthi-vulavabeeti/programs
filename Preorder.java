class Preorder {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Preorder traversal method
    void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Process current node
        System.out.print(node.data + " ");

        // Traverse left subtree
        preorderTraversal(node.left);

        // Traverse right subtree
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(tree.root); // Output: 1 2 4 5 3
    }
}