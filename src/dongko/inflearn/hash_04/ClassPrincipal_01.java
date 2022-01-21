package dongko.inflearn.hash_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title 학급 회장 
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/04-01
 */
public class ClassPrincipal_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		char [] c = new char[N];
		String s = in.nextLine();
		c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<> ();
		for(int i = 0; i < N; i++) {
			map.put(c[i], map.getOrDefault(c[i], 0)+1);
		}
		int max = 0;
		char answer =  ' ';
		for(char key : map.keySet()) {
			if(max < map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
		return;
	}
}
