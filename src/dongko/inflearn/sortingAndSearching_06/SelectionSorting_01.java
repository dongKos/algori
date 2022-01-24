package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title 선택정렬
 * @author dhkim
 * @date 2022. 1. 23.
 * @link https://cote.inflearn.com/contest/10/problem/06-01
 */
public class SelectionSorting_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] n = new int [N];
		
		for(int i = 0; i < N; i++)
			n[i] = in.nextInt();
		
		for(int i = 0; i < N; i++) {
			int idx = i;
			int temp = 0;
			for(int j = i+1; j < N; j++) {
				if(n[idx] > n[j])
					idx = j;
			}
			temp = n[i];
			n[i] = n[idx];
			n[idx] = temp;
		}
		
		for(int i = 0; i < N; i++)
			System.out.print(n[i] + " ");
		return;
	}
}
