package dongko.programmers.level1;


/**
 * @title ��� ���� ��������
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class MiddleLetter {

	class Solution {
	    public String solution(String s) {
	        
	        String answer = "";
	        if(s.length() % 2 == 0) {
	            answer += s.charAt(s.length() / 2 - 1);
	            answer += s.charAt(s.length() / 2);
	        } else {
	            answer = s.charAt(s.length() / 2)+"";
	        }
	        return answer;
	    }
	}
}
