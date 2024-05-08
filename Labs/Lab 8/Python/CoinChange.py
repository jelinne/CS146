from typing import List


class CoinChange:
    def coinChange(self, coins: List[int], amount: int) -> int:
        minc = [amount+1]*(amount+1)
        minc[0] = 0
        for i in range(1, amount + 1):
            for j in coins:
                if i - j >= 0:
                    minc[i] = min(minc[i], minc[i-j] + 1)
        if minc[amount] > amount:
            return -1
        return minc[amount]
