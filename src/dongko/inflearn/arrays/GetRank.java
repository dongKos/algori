package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 등 수 구하기
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-08
 */
public class GetRank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] n = new int[N];
		for(int i = 0; i < N; i++) 
			n[i] = in.nextInt();
		
		for(int i = 0; i < n.length; i++) {
			int cnt = 1;
			for(int j = 0; j < n.length; j++) 
				if(i != j && n[i] < n[j]) 
					cnt++;
			System.out.print(cnt + " ");
		}
		return;
	}
}
