package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 계단 오르기
 * @author dhkim
 * @date 2022. 3. 23.
 * @link https://www.acmicpc.net/problem/2579
 */
public class _2579 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n+1];
			int[] dy = new int[n+1];
			for(int i = 1; i <= n; i++)
				arr[i] = Integer.parseInt(br.readLine());
			
			dy[1] = arr[1];
			if(n >= 2)
				dy[2] = arr[1] + arr[2];
			
			
			for(int i = 3; i < arr.length; i++) {
				dy[i] = Math.max(dy[i-3] + arr[i-1], dy[i-2]) + arr[i];
			}
			
			System.out.println(dy[n]);
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
