package lab4;

/**
 * This class extends BinaryTree and provides methods for checking the existence
 * of an item and getting the level of an item within the tree.
 * 
 * @author mandyho
 * @version oct 4 2023
 */
public class searchBT extends BinaryTree {

    @Override
    public void testing() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int searchItem = 4;
        System.out.println("Contains " + searchItem + ": " + contains(searchItem));
        System.out.println("Level of " + searchItem + ": " + getLevel(searchItem));
    }

    /**
     * Checks if the item exists in the tree.
     *
     * @param item the item to check for
     * @return true if the item exists, false otherwise
     */
    public boolean contains(int item) {
        return contains(root, item);
    }

    /**
     * Recursive helper method to check if a node contains the specified item.
     *
     * @param node the current node
     * @param item the item to check for
     * @return true if the item exists in the current or descendant nodes, false
     *         otherwise
     */
    private boolean contains(TreeNode node, int item) {
        if (node == null) {
            return false;
        }

        if (node.val == item) {
            return true;
        }

        return contains(node.left, item) || contains(node.right, item);
    }

    /**
     * Retrieves the level of a specified item in the tree.
     *
     * @param item the item whose level is to be determined
     * @return the level of the item or -1 if the item doesn't exist
     */
    public int getLevel(int item) {
        return level(root, item, 1);
    }

    /**
     * Recursive helper method to determine the level of a specified item.
     *
     * @param node  the current node
     * @param item  the item whose level is to be determined
     * @param level the level of chose item
     * @return the level of the item or -1 if the item doesn't exist
     */
    private int level(TreeNode node, int item, int level) {
        if (node == null) {
            return -1;
        }
        if (node.val == item) {
            return level;
        }
        int leftLevel = level(node.left, item, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }
        return level(node.right, item, level + 1);
    }
}