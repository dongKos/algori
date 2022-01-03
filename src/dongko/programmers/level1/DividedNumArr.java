package dongko.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @title 나누어 떨어지는 숫자 배열
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12910
 */
public class DividedNumArr {

	class Solution {
	    public ArrayList solution(int[] arr, int divisor) {
	        ArrayList<Integer> list = new ArrayList<> ();
	        for(int n : arr) {
	            if(n % divisor == 0) list.add(n);
	        }
	        Collections.sort(list);
	        if(list.size() == 0) list.add(-1);
	        return list;
	    }
	}
}
