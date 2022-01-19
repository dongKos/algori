package dongko.inflearn.string;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @title 중복문자제거
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-06
 */
public class DuplicateCharacterDelete {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<> ();
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i), i);
		}
		for(Character key : map.keySet())
			System.out.print(key);
	    return ;
	}
}
