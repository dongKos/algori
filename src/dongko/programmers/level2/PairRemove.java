package dongko.programmers.level2;

import java.util.Stack;

/**
 * @title 짝지어 제거하기
 * @author dongko
 * @date 2022. 1. 18.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12973
 */
public class PairRemove {

	public static void main(String[] args) {
		new Solution().solution("baabaa");
		System.out.println();
		new Solution().solution("cdcd");
		System.out.println();
		new Solution().solution("cbdaadbaac");
	}

	static class Solution
	{
		public int solution(String s)
	    {
	        Stack<Character> stack = new Stack<> ();
	        stack.add(s.charAt(0));
	        for(int i = 1; i < s.length(); i++) {
	        	if(stack.isEmpty()) {
	        		stack.add(s.charAt(i));
	        	} else {
	        		if(stack.peek() == s.charAt(i)) stack.pop();
	        		else stack.add(s.charAt(i));
	        	}
	        }
	        
	        return (stack.isEmpty())?1:0;
	    }
	}
}
