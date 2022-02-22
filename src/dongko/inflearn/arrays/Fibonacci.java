package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 피보나치 수열
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-04
 */
public class Fibonacci {
	//메모이제이션을 이용해서 시간 복잡도를 획기적으로 줄인다
	static int [] m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		m = new int [N+1];
		dfs(N);
		for(int i = 0; i < N; i++) System.out.print(m[i] + " ");
		return;
	}
	private static int dfs(int n) {
		if(m[n] > 0) return m[n];
		if(n == 0) return m[n] = 1;
		else if (n == 1) return m[n] = 1;
		else {
			return m[n] = dfs(n-2) + dfs(n-1);
		}
		
	}
	
}
