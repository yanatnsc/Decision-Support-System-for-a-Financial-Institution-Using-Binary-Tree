//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of the BinaryTree utility class
        BinaryTree treeUtility = new BinaryTree();

        // Test Case 1: Simple Binary Tree
        System.out.println("Testing Simple Binary Tree:");
        Node simpleTreeRoot = treeUtility.createSimpleTree();
        int simpleTreeMaxDepth = treeUtility.maxDepth(simpleTreeRoot);
        System.out.println("Maximum depth: " + simpleTreeMaxDepth);
        System.out.println();

        // Test Case 2: Unbalanced Binary Tree (Left-heavy)
        System.out.println("Testing Unbalanced Binary Tree (Left-heavy):");
        Node unbalancedTreeRoot = treeUtility.createUnbalancedTreeLeft();
        int unbalancedTreeMaxDepth = treeUtility.maxDepth(unbalancedTreeRoot);
        System.out.println("Maximum depth: " + unbalancedTreeMaxDepth);
        System.out.println();

        // Test Case 3: Empty Binary Tree
        System.out.println("Testing Empty Binary Tree:");
        Node emptyTreeRoot = treeUtility.createEmptyTree();
        int emptyTreeMaxDepth = treeUtility.maxDepth(emptyTreeRoot);
        System.out.println("Maximum depth: " + emptyTreeMaxDepth);
    }
}