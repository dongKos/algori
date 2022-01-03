package dongko.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title ���ڿ� �� ������� �����ϱ�
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class StringSortAllByMe {

	//comparator ���
	class Solution {
	    public String[] solution(String[] strings, int n) {
	        Arrays.sort(strings, new Comparator<String>(){ 
	            public int compare(String a, String b) {
	                int ac = a.charAt(n);
	                int bc = b.charAt(n);
	                
	                if(ac > bc) {
	                    return 1;
	                } else if( ac == bc ) {
	                    return a.compareTo(b);
	                }
	                return -1;
	            }
	        });
	        return strings;
	    }
	}
}
