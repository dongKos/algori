package dongko.inflearn.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title 격자판 최대합
 * @author dongko
 * @date 2022. 1. 20.
 * @link
 */
public class GridMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [][] n = new int [N][N];
		ArrayList<Integer> sumList = new ArrayList<> ();

		int tempD1 = 0;
		int tempD2 = 0;
		for(int i = 0; i < N; i++) {
			int tempCol = 0;
			int tempRow = 0;
			for(int j = 0; j < N; j++) {
				n[i][j] = in.nextInt();
				tempCol += n[i][j];
				tempRow += n[j][i];
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
			sumList.add(tempCol);
			sumList.add(tempRow);
//			tempD1 += n[i][i];
//			tempD2 += n[i][N-1-i];
		}
		
		for(int i = 0; i < N; i++) {
			tempD1 += n[i][i];
			tempD2 += n[i][N-1-i];
		}
		System.out.println(tempD1);
		System.out.println(tempD2);
		sumList.add(tempD1);
		sumList.add(tempD2);
		int max = sumList.get(0);
		for(int num : sumList)
			if(max < num) max = num;
		System.out.println(max);
		return;
	}
}
