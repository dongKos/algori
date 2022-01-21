package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.Scanner;

/**
 * @title 최대 매출
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/03-03
 */
public class MaxSales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int [] n = new int [N];
		for(int i = 0; i < n.length; i++) 
			n[i] = in.nextInt();
		
		int sum = 0;
		for(int i = 0; i < K;i++)
			sum+=n[i];
		int max = sum;
		
		for(int i = K; i < n.length; i++) {
			sum = sum - n[i-K] + n[i];
			if(max < sum) max = sum;
		}
		System.out.println(max);
		return;
	}
}
