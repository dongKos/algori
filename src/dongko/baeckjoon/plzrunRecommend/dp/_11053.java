package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 가장 긴 증가하는 부분 수열
 * @author dhkim
 * @date 2022. 3. 22.
 * @link https://www.acmicpc.net/problem/11053
 */
public class _11053 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] dy = new int[n];
			int answer = 0;
			String[] str = br.readLine().split(" ");
			for(int i = 0; i < str.length; i++)
				arr[i] = Integer.parseInt(str[i]);
			
			dy[0] = 1;
			answer = dy[0];
			for(int i = 1; i < arr.length; i++) {
				
				int max = 0;
				for(int j = 0; j < i; j++) {
					if(arr[j] < arr[i] && dy[j] > max)
						max = Math.max(max, dy[j]);
				}
				dy[i] = max+1;
				answer = Math.max(answer, dy[i]);
			}
			
			System.out.println(answer);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
