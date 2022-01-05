package dongko.programmers.level1;

/**
 * @title 약수의 합
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class MeasureSum {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        for(int i = 1; i <= n/2; i++) {
	            if(n % i == 0) { 
	                answer += i;
	            }
	        }
	        return answer+n;
	    }
	}
}
