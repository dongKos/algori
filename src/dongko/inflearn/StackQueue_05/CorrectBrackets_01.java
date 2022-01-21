package dongko.inflearn.StackQueue_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title 올바른 괄호
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/05-01
 */
public class CorrectBrackets_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] c = in.next().toCharArray(); 
		
		Stack<Character> s = new Stack<> ();
		s.push(c[0]);
		for(int i = 1; i < c.length; i++) {
			if(s.isEmpty()) {
				s.push(c[i]);
			} else {
				
				char prv = s.peek();
				if(prv == '(' && c[i] == ')') s.pop();
				else s.push(c[i]);
			}
		}
		System.out.println((s.isEmpty())?"YES":"NO");
		return;
	}
}
