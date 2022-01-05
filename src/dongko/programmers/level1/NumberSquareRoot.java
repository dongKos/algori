package dongko.programmers.level1;

/**
 * @title 정수 제곱근 판별
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class NumberSquareRoot {

	class Solution {
	    public double solution(long n) {
	        String s = Math.sqrt(n) + "";
	        String j = s.split("\\.")[0];
	        String ss = s.split("\\.")[1];
	        
	        long l = Long.parseLong(j);
	        return (ss.equals("0"))?Math.pow(l+1, 2):-1;
	    }
	}
}
