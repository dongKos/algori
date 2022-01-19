package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 회문 문자열
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-07
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String p = in.nextLine().toUpperCase();
		int lt = 0, rt = p.length() - 1;
		
		String answer = "YES";
		while(lt < rt) {
			
			if(p.charAt(lt) != p.charAt(rt)) {
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
