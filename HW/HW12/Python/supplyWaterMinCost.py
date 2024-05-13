from typing import List
class supplyWaterMinCost:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        edges = []
        for i in range(n):
            edges.append((0, i+1, wells[i]))
        for pipe in pipes:
            edges.append(pipe)
        edges.sort(key=lambda x: x[2])
        parent = list(range(n+1))

        totalcost = 0
        for h1, h2, cost in edges:
            root1 = h1
            while parent[root1] != root1:
                root1 = parent[root1]
            root2 = h2
            while parent[root2] != root2:
                root2 = parent[root2]
            if root1 != root2:
                parent[root1] = root2
                totalcost += cost
        return totalcost
