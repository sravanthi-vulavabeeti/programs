class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    
    boolean search(Node node, int value) {
        if (node == null) {
            return false; 
        }

        if (node.data == value) {
            return true; 
        }

        
        return search(node.left, value) || search(node.right, value);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int searchValue = 5;
        if (tree.search(tree.root, searchValue)) {
            System.out.println("Value " + searchValue + " found in the tree.");
        } else {
            System.out.println("Value " + searchValue + " not found in the tree.");
        }

        searchValue = 6;
        if (tree.search(tree.root, searchValue)) {
            System.out.println("Value " + searchValue + " found in the tree.");
        } else {
            System.out.println("Value " + searchValue + " not found in the tree.");
        }
    }
}