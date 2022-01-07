package dongko.programmers.level1;

/**
 * @title x만큼 간격이 있는 n개의 숫자
 * @author dhkim
 * @date 2022. 1. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class XN {
	class Solution {
	    public long[] solution(long x, int n) {
	        long[] answer = new long [n];
	        
	        for(int i = 0; i < n; i++) {
	            answer[i] = x * (i+1);
	        }
	        return answer;
	    }
	}

}
