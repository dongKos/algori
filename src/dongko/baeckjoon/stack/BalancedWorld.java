package dongko.baeckjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @title 균형잡힌 세상
 * @author dongko
 * @date 2022. 1. 18.
 * @link https://www.acmicpc.net/problem/4949 
 */
public class BalancedWorld {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			ArrayList<Character> brackets = new ArrayList<> ();
			brackets.add('(');
			brackets.add(')');
			brackets.add('[');
			brackets.add(']');
			
			ArrayList<String> result = new ArrayList<> ();
			while(!(line = br.readLine()).equals(".")) {
				Stack<Character> stack = new Stack<> ();
				
				for(int i = 0; i < line.length(); i++) {
					if(brackets.contains(line.charAt(i))) {
						if(stack.isEmpty()) {
							stack.add(line.charAt(i));
						} else {
							char prv = stack.peek();
							char curr = line.charAt(i);
							
							if((prv == '(' && curr == ')') ||
									(prv == '[' && curr == ']')) {
								stack.pop();
							} else {
								stack.add(curr);
							}
						}
					}
				}
				if(stack.isEmpty())
					result.add("yes");
				else 
					result.add("no");
			}
			for(String str : result) 
				System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
