package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 순열구하기 
 * @author dongko
 * @date 2022. 2. 7.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/73401
 */
public class GetPermutation_06 {

	static int n, m;
	static int [] arr, pm, ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int [n];
		pm = new int [m];
		ch = new int [n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		dfs(0);
	}
	private static void dfs(int l) {
		if(l == m) {
			for(int i = 0; i < pm.length; i++) {
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < arr.length; i++) {
				if(ch[i] != 1) {
					ch[i] = 1;
					pm[l] = arr[i];
					dfs(l+1);
					ch[i] = 0;
				}
			}
		}
	}
}
