package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.Scanner;

/**
 * @title 연속 부분수열
 * @date 2022. 1. 21.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/03-04
 */
public class ContinuousSubSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), M = in.nextInt();
		int [] n = new int [N];
		for(int i = 0; i < n.length; i++) 
			n[i] = in.nextInt();
		
		int cnt=0;
		for(int i = 0; i < n.length; i++) {
			int sum=n[i], p=i+1;
			while(sum < M && p < N) {
				sum+=n[p++];
				if(sum==M) 
					cnt++;
			}
		}
		System.out.println(cnt);
		return;
	}
}
