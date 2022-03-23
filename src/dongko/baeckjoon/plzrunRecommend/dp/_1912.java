package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 연속합
 * @author dhkim
 * @date 2022. 3. 23.
 * @link https://www.acmicpc.net/problem/1912
 */
public class _1912 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] sumArr = new int[n];
			int[] dy = new int[n];
			int answer = Integer.MIN_VALUE;
			String[] str = br.readLine().split(" ");
			for(int i = 0; i < str.length; i++)
				arr[i] = Integer.parseInt(str[i]);
			
			sumArr[0] = dy[0] = arr[0];
			answer = dy[0];
			if(n == 2) {
				System.out.println(Math.max(arr[0], Math.max(arr[1], arr[0]+arr[1])));
				return;
			}
			for(int i = 1; i < arr.length; i++) {
				dy[i] = Math.max(dy[i-1] + arr[i], arr[i]);
				answer = Math.max(dy[i], answer);
			}
			//시간초과나는 풀이
//			for(int i = 1; i < arr.length; i++) {
//				int max = Integer.MIN_VALUE;
//				System.out.println("i : " + i);
//				for(int j = 0; j < i; j++) {
//					if(j == i-1)
//						sumArr[j] = arr[j];
//					else	
//						sumArr[j] = sumArr[j] + arr[i-1];
//					System.out.println("j : " + j + " sumArr[j] : " + sumArr[j]);
//					max = Math.max(max, sumArr[j]);
//				}
//				
//				System.out.println("max : " + max);
//				dy[i] = max + arr[i];
//				answer = Math.max(answer, dy[i]);
//				System.out.println("dy[i] : " + dy[i]);
//			}
			
			System.out.println(answer);
        } catch(Exception e) {
        	
        }
	}
}
