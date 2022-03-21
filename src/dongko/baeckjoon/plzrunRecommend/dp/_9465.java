package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 스티커 
 * @author dhkim
 * @date 2022. 3. 21.
 * @link https://www.acmicpc.net/problem/9465
 */
public class _9465 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());
			int[] answer = new int[t];
			for(int i = 0; i < t; i++) {
				int n = Integer.parseInt(br.readLine());
				int[][] arr = new int[2][n];
				int[][] dy = new int[2][n+1];
				String[] str1 = br.readLine().split(" ");
				String[] str2 = br.readLine().split(" ");
				for(int str = 0; str < str1.length; str++) {
					arr[0][str] = Integer.parseInt(str1[str]);
					arr[1][str] = Integer.parseInt(str2[str]);
				}
				dy[0][1] = arr[0][0];
				dy[1][1] = arr[1][0];
				
				for(int k = 2; k <= n; k++) {
					dy[0][k] = Math.max(dy[1][k-1], dy[1][k-2]) + arr[0][k-1];
					dy[1][k] = Math.max(dy[0][k-1], dy[0][k-2]) + arr[1][k-1];
				}
				
				answer[i] = Math.max(dy[0][n], dy[1][n]);
			}
			for(int a : answer)
				System.out.println(a);
		} catch(Exception e) {
			
		}
	}
}
