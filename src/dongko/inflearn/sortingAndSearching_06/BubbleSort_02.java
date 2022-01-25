package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title 버블정렬
 * @author dongko
 * @date 2022. 1. 24.
 * @link cote.inflearn.com/contest/10/problem/06-01
 */
public class BubbleSort_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] n = new int [N];
		
		for(int i = 0; i < N; i++)
			n[i] = in.nextInt();
		
		//내 풀이
//		int end = N;
//		while(end > 1) {
//			for(int i = 0; i < end-1; i++) {
//				if(n[i] > n[i+1]) {
//					int temp = n[i];
//					n[i] = n[i+1];
//					n[i+1] = temp;
//				}
//			}
//			end--;
//		}
		//선생님 풀이
		for(int i = 0; i < N-1; i++) 
			for(int j = 0; j < N-i-1; j++) 
				if(n[j] > n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
		
		for(int i = 0; i < N; i++)
			System.out.print(n[i] + " ");
		return;
	}
}
