package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 가장 긴 감소하는 부분 수열
 * @author dhkim
 * @date 2022. 3. 22.
 * @link https://www.acmicpc.net/problem/11722
 */
public class _11722 {
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
			
			dy[n-1] = 1;
			answer = dy[n-1];
			for(int i = n-2; i >= 0; i--) {
				int max = 0;
				for(int j = n-1; j > i; j--) {
					if(arr[j] < arr[i] && dy[j] > max) {
						max = Math.max(max, dy[j]);
					}
				} 
				dy[i] = max+1;
				answer = Math.max(answer, dy[i]);
			}
			
			System.out.println(answer);
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
	}
}
