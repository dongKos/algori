package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 봉우리
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-10
 */
public class Peaks {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt() + 2;
		int [][] n = new int [N][N];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if((i == 0 || j == 0) || (i == N-1 || j == N-1)) n[i][j] = 0;
				else n[i][j] = in.nextInt();
			}
		}
		
		int [] x = {-1, 0, 1, 0};
		int [] y = {0, 1, 0, -1};
		int cnt = 0;
		for(int i = 1; i < N-1; i++) {
			for(int j = 1; j < N-1; j++) {
				int curr = n[i][j];
				boolean isPeak = true;
				for(int p = 0; p < x.length; p++) {
					if(curr <= n[i+x[p]][j+y[p]]) isPeak = false;
				}
				
				if(isPeak) cnt++;
			}
		}
		System.out.println(cnt);
	    return ;
	  }
}
