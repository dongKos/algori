package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 최대 점수 구하기
 * @author dongko
 * @date 2022. 2. 2.
 * @link https://cote.inflearn.com/contest/10/problem/08-03
 */
public class MaxScore_03 {
	static int N;
	static int M;
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		int [] s = new int [N];
		int [] t = new int [N];
		for(int i = 0; i < N; i++) {
			s[i] = in.nextInt();
			t[i] = in.nextInt();
		}
		dfs(0, 0, 0, s, t);
		System.out.println(max);
		return;
	}

	private static void dfs(int l, int sum, int time, int[] s, int[] t) {
		if(time > M) return;
		if(l == N) {
			max = Math.max(max, sum);
		} else {
			dfs(l+1, sum+s[l], time+t[l], s, t);
			dfs(l+1, sum, time, s, t);
		}
	}
}
