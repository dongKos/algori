package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 큰 수 출력하기
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-01
 */
public class PrintBiggerNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String [] s = in.nextLine().split(" ");
		String result = s[0] + " ";
		for(int i = 1; i < s.length; i++) {
			if(Integer.parseInt(s[i-1]) < Integer.parseInt(s[i])) result += s[i] + " ";
		}
		System.out.println(result.trim());
		return;
	}
}
