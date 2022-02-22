package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 바둑이 승차
 * @author dongko
 * @date 2022. 2. 2.
 * @link https://cote.inflearn.com/contest/10/problem/08-02
 */
public class DoggyRide_02 {
	static int C;
	static int N;
	static int max=Integer.MIN_VALUE;
	static int [] arr;
	static int [] ch;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		C = in.nextInt();
		N = in.nextInt();
		arr = new int [N];
		ch = new int [N];
		for(int i = 0; i < arr.length; i++) 
			arr[i] =in.nextInt();
		ch[0] = 1;
		dfs(0);
		System.out.println(max);
		return;
	}
	private static void dfs(int idx) {
		if(idx == N) {
			int sum = 0;
			for(int i = 0; i < ch.length; i++) {
				if(ch[i] != 0) {
					sum+=arr[i];
				}
			}
			if(sum <= C && sum > max)
				max = sum;
		} else {
			ch[idx] = 1;
			dfs(idx+1);
			
			ch[idx] = 0;
			dfs(idx+1);
		}
	}
}
