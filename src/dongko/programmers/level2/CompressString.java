package dongko.programmers.level2;

import java.util.*;

/**
 * @title 문자열 압축
 * @author dhkim
 * @date 2022. 1. 9.
 * @link https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class CompressString {

	class Solution {
	    public int solution(String s) {
	        int answer = s.length();
	        for(int i = 1; i <= s.length() / 2; i++) {
	            Stack<String> stack = new Stack<> ();    
	            String str = "", f = "";
	            
	            for(int j = 0; j <= s.length(); j+=i) {
	                f = (j+i > s.length()-1)?
	                		s.substring(j):
                			s.substring(j, j+i);
	                
	                if(stack.size() > 0) {
	                    String prv = stack.peek();
	                    if(!prv.equals(f)) {
	                        str += (stack.size() == 1)?""+prv:stack.size() + prv;
	                        while(!stack.isEmpty()) {
	                            stack.pop();
	                        }
	                    }
	                }
	                stack.add(f);    
	            }
	            str += (stack.size() == 1)?""+f:stack.size() + f;
	            if(answer > str.length()) answer = str.length();
	        }
	        
	        return answer;
	    }
	}
}
