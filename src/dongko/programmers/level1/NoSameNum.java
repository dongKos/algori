package dongko.programmers.level1;

import java.util.ArrayList;

/**
 * @title 같은 숫자는 싫어
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class NoSameNum {

	public class Solution {
	    public ArrayList solution(int []arr) {
	        ArrayList<Integer> list = new ArrayList<> ();
	        int prv = -1;
	        for(int i = 0; i < arr.length; i++) {
	            if(prv != arr[i]) {
	                list.add(arr[i]);
	                prv = arr[i];
	            }
	        }
	        return list;
	    }
	}
}
