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
		s.push(c[0]);
		for(int i = 1; i < c.length; i++) {
			if(s.isEmpty()) {
				s.push(c[i]);
			} else {
				
				char prv = s.peek();
				if(prv == ')') {
					while(s.peek() != '(')
						s.pop();
					s.pop();
				} else 
					s.push(c[i]);
			}
		}
		System.out.println(s);
		return;
	  }
}
