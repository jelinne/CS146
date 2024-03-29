from collections import deque
from typing import Optional, List
from hw10 import TreeNode

class LevelOrder:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        lvl_order = []
        if root is None:
            return lvl_order
        queue = deque([root])
        while queue:
            size = len(queue)
            lvls = []
            for _ in range(size):
                node = queue.popleft()
                lvls.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            lvl_order.append(lvls)
        return lvl_order
