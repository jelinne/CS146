from hw10.LevelOrder import LevelOrder
from hw10.TreeNode import TreeNode

if __name__ == "__main__":
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    lvl_order = LevelOrder()
    print(lvl_order.levelOrder(root))
