package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 공통 원소 구하기 
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/03-02
 */
public class CommonElement {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		int[] n = new int[N];
		for (int i = 0; i < N; i++) {
			n[i] = in.nextInt();
		}
		in.nextLine();
		int M = in.nextInt();
		int[] m = new int[M];
		for (int i = 0; i < M; i++) {
			m[i] = in.nextInt();
		}
		Arrays.sort(n);
		Arrays.sort(m);
		ArrayList<Integer> result = new ArrayList<> ();
		int p1 = 0, p2 = 0;
		while(p1 < N && p2 < M) {
			if(n[p1] < m[p2]) {
				p1++;
			} else if(m[p2] < n[p1]) {
				p2++;
			} else {
				result.add(n[p1++]);
				p2++;
			}
		}
		for(int num : result) 
			System.out.print(num + " ");
	    return ;
	  }
}
