package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 유효한 펠린드롬
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-08
 */
public class ValidPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase();
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				temp += str.charAt(i);
			}
		}
		
		String answer = "YES";
		int lt = 0, rt = temp.length() - 1;
		while(lt < rt) {
			if(temp.charAt(lt) != temp.charAt(rt)) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		System.out.println(answer);
		return;
	}
}
