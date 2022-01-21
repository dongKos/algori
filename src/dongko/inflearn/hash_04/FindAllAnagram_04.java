package dongko.inflearn.hash_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title 모든 아나그램 찾기
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/04-04
 */
public class FindAllAnagram_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String T = in.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < T.length(); i++) {
			map.put(T.charAt(i), map.getOrDefault(T.charAt(i), 0) + 1);
			map2.put(S.charAt(i), map2.getOrDefault(S.charAt(i), 0) + 1);
		}
		int cnt = 0;
		if(isAnagram(map, map2)) cnt++;
		int k = T.length();
		for(int i = k; i < S.length(); i++) {
			map2.put(S.charAt(i-k), map2.get(S.charAt(i-k))-1);
			map2.put(S.charAt(i), map2.getOrDefault(S.charAt(i), 0)+1);
			if(isAnagram(map, map2)) cnt++;
		}
		System.out.println(cnt);
		return;
	}

	private static boolean isAnagram(HashMap<Character, Integer> map, HashMap<Character, Integer> map2) {
		boolean isAnagram = true;
		for (char key : map.keySet())
			if (map.get(key) != map2.get(key)) {
				isAnagram = false;
				break;
			}
		return isAnagram;
	}
}
