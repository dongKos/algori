package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 문자열 압축
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-11
 */
public class StringCompress {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine()+ " ";
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int p = i+1;
			int cnt = 1;
			while(p <= str.length()-1) {
				if(str.charAt(p) == c) {
					cnt++;
				} else {
					result += c + ((cnt == 1)?"":cnt+"");
					i = i + cnt -1;
					break;
				}
				p++;
			}
		}
		System.out.println(result);
		return;
	}
}
