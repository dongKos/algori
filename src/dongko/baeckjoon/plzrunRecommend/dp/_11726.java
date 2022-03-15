package dongko.baeckjoon.plzrunRecommend.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 2xn 타일링
 * @author dhkim
 * @date 2022. 3. 15.
 * @link
 */
public class _11726 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] dy = new int[n+1];
			dy[0] = 1;
			dy[1] = 1;
			
			for(int i = 2; i <= n; i++) {
				dy[i] = (dy[i-1] + dy[i-2])%10007;
			}
			System.out.println(dy[n] % 10007);
		} catch (Exception e) {

		}
	}
}
