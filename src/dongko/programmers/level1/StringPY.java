package dongko.programmers.level1;

/**
 * @title ���ڿ� �� p�� y�� ����
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class StringPY {

	class Solution {
	    boolean solution(String s) {
	        int p = 0, y = 0;
	        for(int i = 0; i < s.length(); i++) {
	            String str = (s.charAt(i) + "").toLowerCase();
	            if(str.equals("p")) p++;
	            else if (str.equals("y")) y++;
	        }
	        return (p == y)?true:false;
	    }
	}
}
