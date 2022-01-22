package dongko.inflearn.StackQueue_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title 후위식연산
 * @author dhkim
 * @date 2022. 1. 22.
 * @link https://cote.inflearn.com/contest/10/problem/05-04
 */
public class Postfix_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] c = in.nextLine().toCharArray();
		Stack<Integer> s = new Stack<> ();
		
		for(int i = 0; i < c.length; i++) {
			char ch = c[i];
			if(Character.isDigit(ch)) {
				s.push(Integer.parseInt(c[i]+""));
			} else {
				int rt = s.pop();
				int lt = s.pop();
				
				switch(ch) {
					case '+' : s.push(lt+rt); break;
					case '-' : s.push(lt-rt); break;
					case '*' : s.push(lt*rt); break;
					case '/' : s.push(lt/rt); break;
				}
			}
		}
		System.out.println(s.pop());
		return;
	}
}
