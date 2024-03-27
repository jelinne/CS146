public class ValidBST {
	public boolean isValidBST(TreeNode root) {
		return validBSTHelper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean validBSTHelper(TreeNode node, int lowerLimit, int upperLimit) {
		if (node == null) {
			return true;
		}
		if (node.val <= lowerLimit || node.val >= upperLimit) {
			return false;
		}
		return validBSTHelper(node.left, lowerLimit, node.val) && validBSTHelper(node.right, node.val, upperLimit);
	}

}
