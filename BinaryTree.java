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

        BTPrinting btPrinting = new BTPrinting();

        btPrinting.preOrder();
        btPrinting.printLeft();

        searchBT searchBT = new searchBT();
        
        int numToFind = 1;
        System.out.println(numToFind + " " + searchBT.contains(numToFind));
        System.out.println("level" + numToFind + " in tree " + searchBT.getLevel(numToFind));

    }
}
class MyBinaryTree extends BinaryTree {
    @Override
    public void testing() {
        System.out.println("test");
    }
}
