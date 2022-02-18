package dongko.leetcode.string;

/**
 * @title Minimum Number of Operations to Move All Balls to Each Box
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 */
public class _1769 {
	class Solution {
		public int[] minOperations(String boxes) {
			int lt, rt;
			int[] r = new int[boxes.length()];
			for (int i = 0; i < boxes.length(); i++) {

				int cnt = 0;
				lt = i - 1;
				rt = i + 1;

				while (lt >= 0) {
					if ((boxes.charAt(lt) + "").equals("1"))
						cnt += i - lt;
					lt--;
				}

				while (rt <= boxes.length() - 1) {
					if ((boxes.charAt(rt) + "").equals("1"))
						cnt += rt - i;
					rt++;
				}
				r[i] = cnt;
			}
			return r;
		}
	}
}
