package HW10;
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
     
     public static void main(String[] args) {
    	 LevelOrder lvlOrder = new LevelOrder();
    	 TreeNode root = new TreeNode(4);
    	 root.left = new TreeNode(3);
    	 root.right = new TreeNode(8);
    	 root.left.left = new TreeNode(1);
    	 root.right.left = new TreeNode(5);
    	 root.right.right = new TreeNode(9);
    	 System.out.print(lvlOrder.levelOrder(root));
    	 
     }

  }
