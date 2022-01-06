package dongko.programmers.level1;

/**
 * @title Æò±Õ ±¸ÇÏ±â
 * @author dhkim
 * @date 2022. 1. 6.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class Average {

	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        for(int i = 0; i < arr.length; i++) {
	            answer += arr[i];
	        }
	        return answer / arr.length;
	    }
	}
}
