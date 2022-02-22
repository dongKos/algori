package dongko.leetcode.string;

/**
 * @title Running Sum of 1d Array
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class _1480 {
	class Solution {
		public int[] runningSum(int[] nums) {
			int[] sum = new int[nums.length];
			sum[0] = nums[0];
			for (int i = 1; i < nums.length; i++) {
				sum[i] = sum[i - 1] + nums[i];
			}
			return sum;
		}
	}
}
