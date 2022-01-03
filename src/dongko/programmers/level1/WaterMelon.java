package dongko.programmers.level1;

/**
 * @title 수박수박수박수박수박수?
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class WaterMelon {

	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        for(int i = 1; i <= n; i++) {
	            if(i % 2 == 0) answer += "박";
	            else answer += "수";
	        }
	        return answer;
	    }
	}
}
