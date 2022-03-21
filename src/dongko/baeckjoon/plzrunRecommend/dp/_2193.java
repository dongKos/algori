package dongko.baeckjoon.plzrunRecommend.dp;

import java.util.Scanner;

/**
 * @title 이친수 
 * @author dhkim
 * @date 2022. 3. 21.
 * @link https://www.acmicpc.net/problem/2193
 */
public class _2193 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] dy = new long[n+1];
		dy[0] = 1;
		dy[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		System.out.println(dy[n-1]);
	}
}
