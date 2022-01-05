package dongko.programmers.level1;


/**
 * @title 문자열을 정수로 바꾸기
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class StringToInt {

	class Solution {
	    public int solution(String s) {
	        char c = s.charAt(0);
	        int answer = 0;
	        if(c == '-' || c == '+') {
	            answer = Integer.parseInt(s.substring(1, s.length()));
	        } else {
	            answer = Integer.parseInt(s);
	        }
	        
	        return Integer.parseInt(s);
	    }
	}
}
