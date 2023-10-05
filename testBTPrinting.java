public class testBTPrinting extends BTPrinting{

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(0);
		TreeNode data1 = new TreeNode(1);
		TreeNode data2 = new TreeNode(2);
		TreeNode data3 = new TreeNode(3);
		TreeNode data4 = new TreeNode(4);
		TreeNode data5 = new TreeNode(5);
		TreeNode data6 = new TreeNode(6);

		root1.setLeft(data1);
		root1.setRight(data2);		
		data1.setLeft(data3);		
		data1.setRight(data4);		
		data4.setLeft(data5);
		data4.setRight(data6);
		
		preOrderPrint(root1);
		System.out.println();
		printLeftNode(root1);

	}

	private static void printLeftNode(TreeNode root1) {
		printLeft(root1);		
	}

	private static void preOrderPrint(TreeNode root1) {
		preOrder(root1);		
	}

}
