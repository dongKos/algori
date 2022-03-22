package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 가장 긴 바이토닉 부분 수열
 * @author dhkim
 * @date 2022. 3. 22.
 * @link https://www.acmicpc.net/problem/11054
 */
public class _11054 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] dy = new int[n];
			int[] dy2 = new int[n];
			int answer = 0;
			String[] str = br.readLine().split(" ");
			for(int i = 0; i < str.length; i++)
				arr[i] = Integer.parseInt(str[i]);
			if(n == 1) {
				System.out.println(1);
				return;
			} else if(n == 2) {
				if(arr[0] == arr[1]) {
					System.out.println(1);
				} else 
					System.out.println(2);
				return;
			}
			dy[0] = 1;
			dy2[n-1] = 1;
			answer = dy[0];
			
			for(int i = 1; i < arr.length; i++) {
				
				int max = 0;
				for(int j = 0; j < i; j++) {
					if(arr[j] < arr[i] && dy[j] > max) 
						max = Math.max(max, dy[j]);
				}
				dy[i] = max + 1;
			}
			
			for(int i = n-2; i >= 0; i--) {
				int max = 0;
				for(int j = n-1; j > i; j--) {
					if(arr[j] < arr[i] && dy2[j] > max)
						max = Math.max(max, dy2[j]);
				}
				dy2[i] = max+1;
			}
			
			for(int i = 0; i < dy.length; i++) {
				answer = Math.max(answer, dy[i] + dy2[i]);
			}
			System.out.println(answer-1);
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
