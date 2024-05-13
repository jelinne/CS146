from hw12.suppyWaterMinCost import supplyWaterMinCost

if __name__ == "__main__":
    sup = supplyWaterMinCost()
    n = 2
    wells = [1, 1]
    pipes = [[1, 2, 1], [1, 2, 2]]
    print(sup.minCostToSupplyWater(n, wells, pipes))

