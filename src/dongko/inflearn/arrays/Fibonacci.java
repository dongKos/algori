package dongko.inflearn.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title 피보나치 수열
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-04
 */
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> f = new ArrayList<> ();
		
		f.add(1);
		f.add(1);
		
		for(int i = 2; i < N; i++) {
			f.add(f.get(i-1) + f.get(i-2));
		}
		
		for(int num : f) 
			System.out.print(num + " ");
		return;
	}
	
}
