package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 조합수
 * @author dongko
 * @date 2022. 2. 2.
 * @link https://cote.inflearn.com/contest/10/problem/08-07
 */
public class CombinationNum_07 {
	static int count=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i ++)
			arr[i] = i;
		int [] ch = new int [n];
		
		ch[0] = 1;
		dfs(1, m, arr, ch);
		System.out.println(count);
		return;
	}
	
	private static void dfs(int cnt, int m, int [] arr, int[] ch) {
		if(cnt == m) {
			count++;
			for(int i = 0; i < ch.length; i++)
				if(ch[i] == 1) System.out.print(i + " ");
			System.out.println();
		} else {
			for(int i = 0; i < arr.length; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					dfs(cnt+1, m, arr, ch);
					ch[i] = 0;
				}
			}
			
		}
		
	}
}
