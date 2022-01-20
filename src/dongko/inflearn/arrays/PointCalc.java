package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 점수 계산
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-07
 */
public class PointCalc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] n = new int [N];
		int cnt = 0, sum = 0;
		for(int i = 0; i < N; i++) {
			int ox = in.nextInt();
			n[i] = ox;
			
			if(ox == 1) {
				cnt++;
				sum += cnt;
			} else {
				cnt = 0;
			}
		}
		System.out.println(sum);
		return;
	}
}
