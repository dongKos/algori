package dongko.baeckjoon.plzrunRecommend.dp;

import java.util.Scanner;

/**
 * @title 오르막 수
 * @author dhkim
 * @date 2022. 3. 21.
 * @link https://www.acmicpc.net/problem/11057
 */
public class _11057 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] dy = new int[n+2][10];
		
		for(int i = 0; i < 10; i++) {
			dy[1][i] = 1;
		}
		
		for(int i = 2; i <= n+1; i++) {
			for(int j = 0; j < 10; j++) {
				int sum = 0;
				for(int k = j; k < 10; k++) {
					sum+=dy[i-1][k];
				}
				dy[i][j] = sum % 10007;
				
			}
		}
		System.out.println(dy[n+1][0] % 10007);
	}
}
