from lab8.CoinChange import CoinChange

if __name__ == "__main__":
    c = CoinChange()
    coins = [1, 2, 5]
    amount = 11
    print(c.coinChange(coins, amount))
    c2 = CoinChange()
    coins2 = [2]
    amount2 = 3
    print(c2.coinChange(coins2, amount2))
    c3 = CoinChange()
    coins3 = [3, 5]
    amount3 = 9
    print(c3.coinChange(coins3, amount3))
