package dongko.programmers.level1;

/**
 * @title ÇÏ»þµå ¼ö
 * @author dhkim
 * @date 2022. 1. 6.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Hashard {

	class Solution {
	    public boolean solution(int x) {
	        int sum = 0;
	        int X = x;
	        for(int i = 0; i < (x+"").length(); i++) {
	            sum += X % 10;
	            X /= 10;
	        }
	        return (x % sum == 0)?true:false;
	    }
	}
}
