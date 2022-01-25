package dongko.inflearn.StackQueue_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title 괄호문자제거 
 * @date 2022. 1. 21.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/05-02
 */
public class RemoveBracketWord_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char [] c = in.next().toCharArray(); 
		Stack<Character> s = new Stack<> ();
		String result = "";
		for(int i = 0; i < c.length; i++) 
			if(c[i] == '(') 
				s.push(c[i]);
			else if(c[i] == ')') 
				s.pop();
			else 
				if(s.isEmpty()) 
					result+=c[i];
		
		System.out.println(result);
		return;
	  }
}
