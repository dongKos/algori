package dongko.programmers.level1;

/**
 * @title 최대공약수와 최소공배수
 * @author dhkim
 * @date 2022. 1. 6.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class Gcd {
	
	//유클리드 호제법으로 최대 공약수 구한 후, 공식으로 최소공배수 구함
	class Solution {
		public int[] solution(int n, int m) {
			int gcd = 유클리드(Math.min(n, m), Math.max(n, m));
			int[] answer = new int[2];
			answer[0] = gcd;
			answer[1] = (n / gcd) * (m / gcd) * gcd;
			return answer;
		}

		public int 유클리드(int min, int max) {
			int r = 0;
			while (true) {
				r = max % min;
				if (r == 0)
					break;
				max = min;
				min = r;
			}
			return min;
		}

	}
}
