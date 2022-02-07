package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 조합수 - 메모이제이션
 * @author dongko
 * @date 2022. 2. 7.
 * @link https://cote.inflearn.com/contest/10/problem/08-07
 */
public class Combination_07 {
	static int [][] dy;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		dy = new int [n+1][r+1];
		
		System.out.println(combination(n, r));
		return;
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
