package dongko.baeckjoon.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());

			System.out.println(fibo(n));
		} catch (Exception e) {
			e.printStackTrace();
		}
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
