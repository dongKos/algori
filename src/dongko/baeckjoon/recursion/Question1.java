package dongko.baeckjoon.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(factorial(n));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n-1);
		else
			return 1;
	}
}
