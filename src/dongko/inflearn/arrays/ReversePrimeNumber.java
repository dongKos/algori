package dongko.inflearn.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title 뒤집은 소수
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-06
 */
public class ReversePrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String [] s = in.nextLine().split(" ");
		ArrayList<Integer> list = new ArrayList<> ();
		
		for(int i = 0; i < s.length; i++) {
			StringBuilder sb = new StringBuilder(s[i]);
			int num = Integer.parseInt(sb.reverse().toString());
			if(isPrime(num)) list.add(num);
		}
		for(int num : list)
			System.out.print(num + " ");
		return;
	}

	private static boolean isPrime(int num) {
		if(num == 1) return false;
		else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
