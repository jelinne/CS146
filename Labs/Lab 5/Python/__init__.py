from lab5.TreeNode import TreeNode
from lab5.isValidBST import IsValidBST

if __name__ == "__main__":
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    validBST = IsValidBST()
    print(validBST.isValidBST(root))
