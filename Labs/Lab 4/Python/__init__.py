from lab4.TreeNode import TreeNode
from lab4.invertTree import InvertTree

if __name__ == "__main__":
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    root.right.right.right = TreeNode(15)
    root.right.right.right.left = TreeNode(12)
    root.right.right.right.right = TreeNode(16)
    root.right.right.right.left.left = TreeNode(10)
    root.right.right.right.left.right = TreeNode(13)

    invertTree = InvertTree()
    invertTree.invertTree(root)
    print(str(root.val) + ", " + str(root.left.val) + ", " + str(root.right.val))
