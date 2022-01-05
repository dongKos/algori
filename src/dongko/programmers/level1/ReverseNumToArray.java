package dongko.programmers.level1;

/**
 * @title 자연수 뒤집어 배열로 만들기
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class ReverseNumToArray {

	class Solution {
	    public int[] solution(long n) {
	        String s = n + "";
	        int[] answer = new int [s.length()];
	        int idx = 0;
	        for( int i = s.length()-1; i >= 0; i--) {
	            answer[idx++] = Integer.parseInt(s.charAt(i)+"");
	        }
	        
	        return answer;
	    }
	}
}
