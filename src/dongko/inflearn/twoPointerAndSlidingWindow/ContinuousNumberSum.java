package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.Scanner;

/**
 * @title 연속된 자연수의 합
 * @date 2022. 1. 21.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/03-05
 */
public class ContinuousNumberSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		for(int i = 1; i < N/2+1; i++) {
			int sum = i;
			int p = i+1;
			
			while(sum < N && p < N) {
				sum+=p++;
				if(sum == N)
					cnt++;
			}
		}
		System.out.println(cnt);
		return;
	}
}
