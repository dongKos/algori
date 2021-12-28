package dongko.programmers.level1;

import java.util.Stack;


/**
 * @title 크레인 인형뽑기 게임
 * @author dhkim
 * @date 2021. 12. 28.
 * @link https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
 */
public class CraneDollGame {
	
	public static void main(String[] args) {
		int board [][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		new Solution().solution(board, moves);
	}

	static class Solution {
		public int solution(int[][] board, int[] moves) {
			int popCnt = 0;
			Stack<Integer> stack = new Stack<Integer>();
			for (int m = 0; m < moves.length; m++) {
				int move = moves[m] - 1;

				for (int i = 0; i < board.length; i++) {

					int doll = board[i][move];
					if (doll != 0) {
						board[i][move] = 0;
						stack.push(doll);
						if (stack.size() > 1 && (stack.lastElement() == stack.get(stack.size() - 2))) {
							stack.pop();
							stack.pop();
							popCnt = popCnt + 2;
						}
						break;
					}
				}
			}

			return popCnt;
		}
	}
}
