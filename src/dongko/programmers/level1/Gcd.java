package dongko.programmers.level1;

/**
 * @title �ִ������� �ּҰ����
 * @author dhkim
 * @date 2022. 1. 6.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class Gcd {
	
	//��Ŭ���� ȣ�������� �ִ� ����� ���� ��, �������� �ּҰ���� ����
	class Solution {
		public int[] solution(int n, int m) {
			int gcd = uc(Math.min(n, m), Math.max(n, m));
			int[] answer = new int[2];
			answer[0] = gcd;
			answer[1] = (n / gcd) * (m / gcd) * gcd;
			return answer;
		}

		public int uc(int min, int max) {
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
