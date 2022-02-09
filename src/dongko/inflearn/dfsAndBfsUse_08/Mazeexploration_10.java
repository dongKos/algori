package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title
 * @author dongko
 * @date 2022. 2. 9.
 * @link
 */
public class Mazeexploration_10 {
	static int [][] arr = new int [7][7];
	static int [][] ch = new int [8][8];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return;
	}
}
