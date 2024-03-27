import sys
class IsValidBST:
    def isValidBST(self, root):
        return self.validBSTHelper(root, - sys.maxsize - 1, sys.maxsize)
    def validBSTHelper(self, node, lower_limit, upper_limit):
        if node is None:
            return True
        if node.val <= lower_limit or node.val >= upper_limit:
            return False
        return self.validBSTHelper(node.left, lower_limit, node.val) and self.validBSTHelper(node.right, node.val, upper_limit)

