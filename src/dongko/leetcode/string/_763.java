package dongko.leetcode.string;

import java.util.*;

/**
 * @title Partition Labels
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/partition-labels/
 */
public class _763 {
	class Solution {
		public List<Integer> partitionLabels(String s) {

			List<Integer> result = new ArrayList<>();
			int rt = 0, cnt = 0, sum = 0;
			for (int i = 0; i < s.length(); i++) {
				String t = s.charAt(i) + "";

				for (int j = s.length() - 1; j > i; j--) {
					String ss = s.charAt(j) + "";
					if (t.equals(ss) && j > rt) {
						rt = j;
					}
				}

				if (rt == i) {
					if (result.size() > 0) {
						result.add(rt - sum + 1);
						sum += rt - sum + 1;
					} else {
						result.add(cnt, rt + 1);
						sum += rt + 1;
					}
					cnt++;
				}

				if (i > rt) {
					result.add(1);
					sum++;
				}

			}
			return result;
		}
	}
}
