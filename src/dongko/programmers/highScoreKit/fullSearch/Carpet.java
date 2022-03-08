package dongko.programmers.highScoreKit.fullSearch;

/**
 * @title 카펫
 * @author dhkim
 * @date 2022. 3. 8.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42842?language=java#
 */
public class Carpet {
	class Solution {
	    
	    public int[] solution(int brown, int yellow) {
	        int[] answer = {3, 3};
	        for(int i = 1; i < yellow; i++) {
	            int x = i;
	            int y = yellow/i;
	            if(brown == countBrown(x, y) && x*y == yellow) {
	                int nx = x+2;
	                int ny = y+2;
	                answer[0] = Math.max(nx, ny);
	                answer[1] = Math.min(nx, ny);
	                break;
	            }
	        }
	        return answer;
	    }
	    
	    public int countBrown(int x, int y) {
	        int brown = x*2 + y*2 + 4;
	        return brown;
	    }
	}
}
