package Lab8;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] min = new int[amount+1];
		Arrays.fill(min, amount+1);
		min[0] = 0;
		for(int i = 1; i <= amount; i++) {
			for(int j = 0; j < coins.length; j++) {
				if(i-coins[j] >=0 ) {
					min[i] = Math.min(min[i], min[i-coins[j]]+1);
				}
			}
		}
		if(min[amount] > amount) {
			return -1;
		}
		return min[amount];
	 }
	public static void main(String[] args) {
		CoinChange c = new CoinChange();
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(c.coinChange(coins,amount));
		CoinChange c2 = new CoinChange();
		int[] coins2 = {2};
		int amount2 = 3;
		System.out.println(c2.coinChange(coins2,amount2));
		CoinChange c3 = new CoinChange();
		int[] coins3 = {3,5};
		int amount3 = 9;
		System.out.println(c3.coinChange(coins3,amount3));
		CoinChange c4 = new CoinChange();
		int[] coins4 = {1};
		int amount4 = 0;
		System.out.println(c4.coinChange(coins4,amount4));
	}
}
