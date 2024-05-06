// Define the Node class for the binary tree
class Node {
    int value;
    Node left;
    Node right;

    // Constructor
    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Utility class for binary tree operations
public class BinaryTree {

    // Create a simple binary tree (Test Case 1)
    public static Node createSimpleTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }
    //       1
    //      / \
    //     2   3
    //    / \ / \
    //   4  5 6  7

    // Create a unbalanced binary tree (Test Case 2)
    public static Node createUnbalancedTreeLeft() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }
    //       1
    //      / \
    //     2   3
    //    / \   \
    //   4  5    7
    //  /
    // 6

    // Create an empty binary tree (Test Case 3)
    public static Node createEmptyTree() {
        return null;
    }

    // Compute the "maxDepth" of a tree
    int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            }
            else {
                return (rightDepth + 1);
            }
        }
    }
}
