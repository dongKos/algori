package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 문자 찾기
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-01
 */
public class FindString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase();
		String ch = in.nextLine().toLowerCase();
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i)+"").equals(ch)) cnt++;
		}
		System.out.println(cnt);
	}
}
