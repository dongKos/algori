package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title Least Recently Used
 * @author dongko
 * @date 2022. 1. 24.
 * @link https://cote.inflearn.com/contest/10/problem/06-04
 */
public class LRU_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int [] c = new int [s];
		int [] w = new int [n];
		for(int i = 0; i < w.length; i++)
			w[i] = in.nextInt();
		
		for(int i = 0; i < w.length; i++) {
			int work = w[i];
			boolean contains = false;
			int j;
			for(j = 0; j < c.length; j++) 
				if(c[j] == work) {
					contains = true;
					break;
				}
			
			int start = c.length-1;
			if(contains) start = j;
			
			for(int k = start; k > 0; k--) 
				c[k] = c[k-1];
			
			c[0] = work;
		}
		for(int l = 0; l < c.length; l++)
			System.out.print(c[l] + " ");
		
		return;
	}
}
