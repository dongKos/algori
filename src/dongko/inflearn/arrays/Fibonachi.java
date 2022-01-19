package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 피보나치 수열
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-04
 */
public class Fibonachi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		System.out.println(fibo(input1));
		return;
	}
	
	static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}
}
