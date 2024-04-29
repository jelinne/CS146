package Lab1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
	public int[] TwoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i <nums.length; i++) {
			int num = target - nums[i];
			if(map.containsKey(num)) {
				return new int[] {nums[map.get(num)],nums[i]};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		TwoSums sum = new TwoSums();
		int[] arr = {1,2,3,4};
		int target = 4;
		System.out.print(Arrays.toString(sum.TwoSum(arr,target)));
	}
}
