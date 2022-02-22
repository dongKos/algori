package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @title 동전교환
 * @author dongko
 * @date 2022. 2. 2.
 * @link https://cote.inflearn.com/contest/10/problem/08-05
 */
public class CoinExchange_05 {

	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer [] c = new Integer [n];
		for(int i = 0; i < n; i++)
			c[i] = in.nextInt();
		Arrays.sort(c, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int m = in.nextInt();
		dfs(0, 0,  c, m);
		System.out.println(min);
		return;
	}

	private static void dfs(int sum, int cnt, Integer[] c, int m) {
		if(sum > m) return;
		if(cnt >= min) return;
		if(sum == m) {
			min = Math.min(cnt, min);
		} else {
			for(int i = 0; i < c.length; i++) {
				dfs(sum+c[i], cnt+1, c, m);
			}
		}
		
	}
}
