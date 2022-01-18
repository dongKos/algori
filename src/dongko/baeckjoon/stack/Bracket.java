package dongko.baeckjoon.stack;

import java.util.*;
import java.io.*;

/**
 * @title 괄호 
 * @author dongko
 * @date 2022. 1. 18.
 * @link https://www.acmicpc.net/problem/9012
 */
public class Bracket {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(br.readLine());
			ArrayList<String> result = new ArrayList<> ();
			for(int i = 0; i < T; i++) {
				String line = br.readLine();
				Stack<Character> stack = new Stack<> ();
				
				stack.add(line.charAt(0));
				for(int j = 1; j < line.length(); j++) {
					
					if(stack.isEmpty()) {
						stack.add(line.charAt(j));
					} else {
						char prv = stack.peek();
						if(prv == '(' && line.charAt(j) == ')') {
							stack.pop();
						} else {
							stack.add(line.charAt(j));
						}
					}
				}
				if(stack.isEmpty())
					result.add("YES");
				else 
					result.add("NO");
			}
			
			for(String str : result) 
                System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
