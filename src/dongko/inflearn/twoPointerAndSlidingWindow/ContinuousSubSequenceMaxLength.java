package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.Scanner;

/**
 * @title 최대 길이 연속부분수열
 * @date 2022. 1. 21.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/03-06
 */
public class ContinuousSubSequenceMaxLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int [] n = new int [N];
		int cnt = 0;
		int p = 0;
		for(int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
			if(n[i] == 0)cnt++;
			if(cnt == K) p = i+1;
			System.out.print(n[i] + " ");
		}
		System.out.println("p : " + p);
		int sum = p;
		int s = 1;
		int prvP = p;
		while(p < N) {
			
			System.out.println("s : " + s + "  n[s] : " + n[s] + " p : " + p + " n[p] : " + n[p]);
			if(n[s] == 0) {
				p++;
				while(p < n.length && n[p] != 0) {
					p++;
				}
			} else {
				sum-=1;
			}
			if(prvP != p) sum+=p-prvP;
			s++;
			System.out.println(sum);
		}
		return;
	}
}
