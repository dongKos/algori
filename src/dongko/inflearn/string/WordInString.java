package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 문장 속 단어
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-03
 */
public class WordInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String [] s = str.split(" ");
		
		int max = s[0].length(); 
		for(int i = 0; i < s.length; i++) {
			if(max < s[i].length()) max = s[i].length(); 
		}
		
		for(int i = 0; i < s.length; i++) {
			if(max == s[i].length()) {
				System.out.println(s[i]);
				break;
			}
		}
		return;
	}
}
