package dongko.inflearn.StackQueue_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title ¼è ¸·´ë±â
 * @author dhkim
 * @date 2022. 1. 22.
 * @link https://cote.inflearn.com/contest/10/problem/05-05
 */
public class IronStick_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] c = in.nextLine().toCharArray();
		Stack<Character> s = new Stack<> ();
		int sum = 0;
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '(') {
				s.push(c[i]);
			} else {
				if(c[i-1] == '(') {
					s.pop();
					sum+=s.size();
				} else {
					s.pop();
					sum+=1;
				}
			}
			
		}
		System.out.println(sum);
		return;
	}

}
