package dongko.programmers.level1;

import java.util.HashSet;

/**
 * @title ÆùÄÏ¸ó
 * @author dhkim
 * @date 2021. 12. 28.
 * @link https://programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Ponketmon {

	public static void main(String[] args) {
		
	}
	
	class Solution {
	    public int solution(int[] nums) {
	        HashSet<Integer> set = new HashSet<> ();
	        for(int n : nums) {
	            set.add(n);
	        }
	        if(set.size() >= nums.length / 2) return nums.length / 2;
	        else return set.size();
	    }
	}
}
