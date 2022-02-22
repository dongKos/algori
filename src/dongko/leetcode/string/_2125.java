package dongko.leetcode.string;

/**
 * @title Number of Laser Beams in a Bank
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */
public class _2125 {
	class Solution {
		public int numberOfBeams(String[] bank) {
			int result = 0;

			for (int i = 0; i < bank.length - 1; i++) {
				String l = bank[i];

				if (l.contains("1")) {

					for (int j = i + 1; j < bank.length; j++) {

						if (bank[j].contains("1")) {
							result += countL(bank[i]) * countL(bank[j]);
							break;
						}
					}
				}
			}
			return result;
		}

		public int countL(String l) {
			int cnt = 0;
			for (int i = 0; i < l.length(); i++) {
				if ((l.charAt(i) + "").equals("1"))
					cnt++;
			}
			return cnt;
		}
	}
}
