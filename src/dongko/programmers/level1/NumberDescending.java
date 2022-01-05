package dongko.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * @title 정수 내림차순으로 배치하기
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class NumberDescending {

//	collections.reverseOrder();
	class Solution {
	    public long solution(long n) {
	        String s = n + "";
	        Integer [] arr = new Integer [s.length()];
	        int cnt = 0;
	        for(int i = 0; i < s.length(); i++) {
	            arr[cnt++] = Integer.parseInt(s.charAt(i)+"");
	        }
	        Arrays.sort(arr, Collections.reverseOrder());
	        String str = "";
	        for( int i = 0 ; i < arr.length; i++) {
	            str += arr[i];
	        }
	        return Long.parseLong(str);
	    }
	}
}
