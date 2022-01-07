package dongko.programmers.level1;

/**
 * @title 핸드폰번호 가리기
 * @author dhkim
 * @date 2022. 1. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12948
 */
public class PhoneNumber {

	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        int cnt = 0;
	        for(int i = phone_number.length() - 1; i >= 0; i--) {
	            if(cnt++ >= 4)
	                answer += "*";
	            else
	                answer += phone_number.charAt(i);
	        }
	        StringBuilder sb = new StringBuilder(answer);
	        return sb.reverse().toString();
	    }
	}
}
