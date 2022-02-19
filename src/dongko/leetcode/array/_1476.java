package dongko.leetcode.array;

/**
 * @title Subrectangle Queries
 * @author dongko
 * @date 2022. 2. 19.
 * @link https://leetcode.com/problems/subrectangle-queries/
 */
public class _1476 {
	class SubrectangleQueries {

		int[][] r;

		public SubrectangleQueries(int[][] rectangle) {
			r = rectangle;
		}

		public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
			for (int i = 0; i < r.length; i++) {
				for (int j = 0; j < r[i].length; j++) {
					if (i >= row1 && i <= row2 && j >= col1 && j <= col2) {
						r[i][j] = newValue;
					}
				}
			}
		}

		public int getValue(int row, int col) {
			return r[row][col];
		}
	}
}
