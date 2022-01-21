package dongko.inflearn.hash_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title 아나그램 
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/04-02
 */
public class Anagram_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] c1 = in.nextLine().toCharArray(), c2 = in.nextLine().toCharArray();
		HashMap<Character, Integer> map = new HashMap<> (), map2 = new HashMap<> ();
		for(int i = 0; i < c1.length; i++) {
			map.put(c1[i], map.getOrDefault(c1[i], 0)+1);
			map2.put(c2[i], map2.getOrDefault(c2[i], 0)+1);
		}
		boolean isAnagram = true;
		for(char key : map.keySet()) 
			if(map.get(key) != map2.get(key)) {
				isAnagram = false;
				break;
			}
		System.out.println((isAnagram)?"YES":"NO");
		return;
	}
}
