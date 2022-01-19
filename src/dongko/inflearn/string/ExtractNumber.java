package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 숫자만 추출
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-09
 */
public class ExtractNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char [] c = str.toCharArray();
		String result = "";
		for(int i = 0; i < c.length; i++) {
			if(Character.isDigit(c[i]))
				result+= c[i];
		}
		System.out.println(Integer.parseInt(result));
		return;
	}
}
