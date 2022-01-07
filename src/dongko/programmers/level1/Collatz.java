package dongko.programmers.level1;

/**
 * @title ÄÝ¶óÃ÷ ÃßÃø
 * @author dhkim
 * @date 2022. 1. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Collatz {
	class Solution {
	    int cnt = 0;
	    public int solution(long num) {
	        if(num == 1) return 0;
	        collatz(num);
	        return cnt;
	    }
	    
	    public void collatz(long num) {
	        if(cnt == 500) {
	            cnt = -1;
	            return;
	        } 
	        cnt ++;
	        if(num % 2 == 0) {
	            num /= 2;
	        } else {
	            num = num * 3 + 1;
	        }   
	        if(num != 1) collatz(num);
	        else return;
	    }
	}
}
