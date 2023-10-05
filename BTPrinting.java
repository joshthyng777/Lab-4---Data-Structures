
public class BTPrinting extends BinaryTree {
	
	public BTPrinting() {
		super();
	}
	
	public static void preOrder(TreeNode node) {
		if(node==null) return;
		System.out.print(node.val);
		preOrder(node.left);
		preOrder(node.right);		
	}
	
	public static void printLeft(TreeNode node) {
		if (node == null) return;
		printLeft(node.left);
        System.out.print(node.val);
	}
}
