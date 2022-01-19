package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 특정 문자 뒤집기
 * @date 2022. 1. 19.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/01-05
 */
public class ReverseSpecificWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char [] c = str.toCharArray();
		int lt = 0, rt = c.length-1;

		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			} else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		for(char ch : c) {
			System.out.print(ch);
		}
		return;
	}

}
