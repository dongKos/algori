package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title 삽입 정렬 
 * @author dongko
 * @date 2022. 1. 24.
 * @link https://cote.inflearn.com/contest/10/problem/06-03
 */
public class InsertionSorting_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] n = new int [N];
		
		for(int i = 0; i < N; i++)
			n[i] = in.nextInt();
		
		for(int i = 1; i < N; i++) {
			int temp = n[i], j;
			for(j = i-1; j >= 0; j--) {
				if(n[j] > temp) 
					n[j+1] = n[j];
				 else 
					break;
			}
			n[j+1] = temp;
		}
		
		for(int i = 0; i < N; i++)
			System.out.print(n[i] + " ");
		return;
	}
}
