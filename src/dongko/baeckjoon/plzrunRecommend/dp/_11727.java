package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 2xn 타일링 2
 * @author dhkim
 * @date 2022. 3. 15.
 * @link
 */
public class _11727 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] dy = new int[n+1];
			dy[1] = 1;
			dy[2] = 3;
			
			for(int i = 3; i <= n; i++) {
				dy[i] = (dy[i-1] + 2 * dy[i-2])%10007;
			}
			System.out.println(dy[n]);
		} catch (Exception e) {

		}
	}
}
