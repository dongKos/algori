package dongko.programmers.level1;

/**
 * @title 자릿수 더하기
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class DigitSum {

//	형변환이 아닌 %연산과 /연산으로 
	public class Solution {
	    public int solution(int n) {
	        
	        int answer = 0;
	        while(n > 0) {
	            answer += n % 10;
	            n = n /10;
	        }
	        return answer;
	    }
	}
}
