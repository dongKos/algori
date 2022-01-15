package dongko.baeckjoon.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {

	public static void main(String [] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int K = Integer.parseInt(br.readLine());
			int sum = 0;
			Stack<Integer> stack = new Stack<> ();
			for(int i = 0; i < K; i++) {
				int num = Integer.parseInt(br.readLine());
				
				if(num == 0) 
					stack.pop();
				else 
					stack.push(num);
			}
			while(!stack.isEmpty())
				sum+=stack.pop();
			System.out.println(sum);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
