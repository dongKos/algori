package dongko.programmers.level1;

/**
 * @title 문자열 다루기 기본
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class StringHandleBasic {

	class Solution {
	    public boolean solution(String s) {
	        if(s.length() != 4 && s.length() != 6) return false;
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c < 48 || c > 57) return false;
	        }
	        return true;
	    }
	}
}
