package HW10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> lvlOrder = new ArrayList<>();
		if(root == null) {
			return lvlOrder;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			List<Integer> lvls = new ArrayList<>();
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				lvls.add(node.val);
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
			lvlOrder.add(lvls);
		}
		return lvlOrder;
		
	}
}
