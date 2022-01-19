package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 암호
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/01-12
 */
public class Password {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String str = in.nextLine();
		
		String [] s = new String[N];
		for(int i = 0; i < N; i++) {
			s[i] = str.substring(7*i,  (7*i)+7);
		}
		
		for(String p : s) {
			String b = p.replaceAll("#", "1").replaceAll("\\*", "0");
			char ch = (char) Integer.parseInt(b, 2);
			System.out.print(ch);
		}
			
		return;
	}
}
