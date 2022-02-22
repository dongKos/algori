package dongko.leetcode.array;

/**
 * @title Queries on Number of Points Inside a Circle
 * @author dongko
 * @date 2022. 2. 19.
 * @link https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 */
public class _1828 {
	//사분면에서 점과 점사이의 거리는 피타고라스 정리를 이용해서 구한다
	//r = sqrt( pow(x-x2) + pow(y-y2) )
	class Solution {
		public int[] countPoints(int[][] points, int[][] queries) {
			int[] answer = new int[queries.length];

			for (int i = 0; i < queries.length; i++) {

				int x = queries[i][0];
				int y = queries[i][1];
				double r = queries[i][2];
				int cnt = 0;

				for (int j = 0; j < points.length; j++) {
					int x2 = points[j][0];
					int y2 = points[j][1];

					double dist = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
					if (dist <= r)
						cnt++;
				}

				answer[i] = cnt;
			}
			return answer;
		}
	}
}
