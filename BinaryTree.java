class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    protected TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void testing() {
      
    }
}
class MyBinaryTree extends BinaryTree {
    @Override
    public void testing() {
        System.out.println("test");
    }
}
