package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 대소문자 변환
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-02
 */
public class CaseChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str.toLowerCase();
		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				result += (str.charAt(i)+"").toUpperCase();
			} else {
				result += (str.charAt(i)+"").toLowerCase();
			}
		}
		System.out.println(result);
		return;
	}
}
