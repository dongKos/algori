package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 1, 2, 3 더하기
 * @author dhkim
 * @date 2022. 3. 15.
 * @link https://www.acmicpc.net/problem/9095
 */
public class _9095 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] result = new int[n];
			int idx = 0;
			for(int i = 0; i < n; i++) {
				int number = Integer.parseInt(br.readLine());
				int[] dy = new int[11];
				
				dy[1] = 1;
				dy[2] = 2;
				dy[3] = 4;
				
				for(int j = 4; j <= number; j++) {
					dy[j] = dy[j-1] + dy[j-2] + dy[j-3];
				}
				result[idx++] = dy[number];
			}
			for(int num : result)
				System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
