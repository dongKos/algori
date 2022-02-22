package dongko.leetcode.string;

/**
 * @title Partitioning Into Minimum Number Of Deci-Binary Numbers
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */
public class _1689 {
	class Solution {
		public int minPartitions(String n) {
			int max = Integer.parseInt(n.charAt(0) + "");
			for (int i = 0; i < n.length(); i++) {
				int num = Integer.parseInt(n.charAt(i) + "");
				if (max < num)
					max = num;
			}
			return max;
		}
	}
}
