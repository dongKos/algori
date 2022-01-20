package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 소수(에라토스테네스 체)
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-05
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		boolean [] b = new boolean[N+1];
		for(int i = 2; i < Math.sqrt(N); i++) {
			int cnt = 2;
			while(i * cnt <= N) {
				b[i*cnt] = true;
				cnt++;
			}
		}
		int cnt = 0;
		for(int i = 2; i < b.length; i++) {
			if(!b[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		return;
	}
}
