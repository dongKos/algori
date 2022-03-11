package dongko.inflearn.dp_10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 동전교환(냅색 알고리즘)
 * @author dhkim
 * @date 2022. 3. 11.
 * @link https://cote.inflearn.com/contest/10/problem/10-05
 */
public class _5 {

	//dy를 값으로 설정 
	static int[] dy;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		int m = in.nextInt();
		dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		
		dy[0] = 0;
		//가장 중요한 식 - 외워
		for(int i = 0; i < c.length; i++) {
			for(int j = c[i]; j < dy.length; j++) {
				dy[j] = Math.min(dy[j], dy[j - c[i]] + 1);
			}
		}
		System.out.println(dy[m]);
	}
}
