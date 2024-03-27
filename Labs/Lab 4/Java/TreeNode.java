public class TreeNode {
	int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;
    }
    
    public static void main (String[] args) {
    	InvertTree lab4 = new InvertTree();
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(8);
    	root.left.left = new TreeNode(3);
    	root.left.right = new TreeNode(4);
    	root.right.left = new TreeNode(5);
    	root.right.right = new TreeNode(6);
    	lab4.invertTree(root);
    	System.out.print(root.val+", "+root.left.val+", "+root.right.val+", "+ root.left.left.val+", "+ root.left.right.val);
    }
}
