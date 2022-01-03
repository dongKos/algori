package dongko.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title 문자열 내림차순으로 배치하기
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class StringSortDesc {

	class Solution {
	    public String solution(String s) {
	        Character [] c = new Character[s.length()];
	        int size = 0;
	        for(char str : s.toCharArray()) c[size++] = str;
	        Arrays.sort(c, new Comparator<Character>() {
	            @Override
	            public int compare(Character a, Character b) {
	                return b-a;
	            }
	        });
	        String result = "";
	        for(Character ch : c) result += ch;
	        return result;
	    }
	}
}
