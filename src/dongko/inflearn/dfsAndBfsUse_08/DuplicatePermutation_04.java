package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 중복순열 
 * @author dongko
 * @date 2022. 2. 7.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/73399
 */
public class DuplicatePermutation_04 {
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int [] arr = new int [n];
		int [] pm = new int [m];
		dfs(0, arr, pm);
	}

	private static void dfs(int l, int[] arr, int[] pm) {
		if(l == m) {
			
			for(int i = 0; i < pm.length; i++)
				System.out.print((pm[i]+1) + " ");
			System.out.println();
		} else {
			
			for(int i = 0; i < arr.length; i++) {
				pm[l] = i;
				dfs(l+1, arr, pm);
			}
		}
		
	}
}
