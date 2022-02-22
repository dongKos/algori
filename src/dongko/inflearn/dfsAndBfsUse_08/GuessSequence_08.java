package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 수열 추측하기
 * @author dongko
 * @date 2022. 2. 8.
 * @link https://cote.inflearn.com/contest/10/problem/08-08
 */
public class GuessSequence_08 {
	static int [][] dy;
	static int [] arr, ch, pm, c;
	static int n, m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		arr = new int [n];
		ch = new int [n];
		pm = new int [n];
		c = new int [n];
		dy = new int [n+1][n+1];
		for(int i = 0; i < n; i++)
			arr[i] = i+1;
		dfs(0);
		return;
	}
	private static void dfs(int l) {
		if(l == n) {
			int sum = 0;
			for(int i = 0; i < pm.length; i++) {
				sum += pm[i] * c[i];
			}
			if(sum == m) {
				for(int i = 0; i < pm.length; i++) {
					System.out.print(pm[i] + " ");
				}
				System.exit(0);
			}
		} else {
			for(int i = 0; i < arr.length; i++) {
				if(ch[i] != 1) {
					ch[i] = 1;
					pm[l] = arr[i];
					c[l] = combination(n-1, l);
					dfs(l+1);
					ch[i] = 0;
				}
			}
		}
	}
	private static int combination(int n, int r) {
		if(dy[n][r] != 0) return dy[n][r];
		if(r ==0 || n == r) {
			return 1;
		} else {
			return dy[n][r] = combination(n-1, r-1) + combination(n-1, r);
		}
	}
	
}
