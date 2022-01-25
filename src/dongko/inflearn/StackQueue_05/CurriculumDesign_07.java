package dongko.inflearn.StackQueue_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 교육과정 설계
 * @author dhkim
 * @date 2022. 1. 22.
 * @link https://cote.inflearn.com/contest/10/problem/05-07
 */
public class CurriculumDesign_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String m = in.nextLine();
		String c = in.nextLine();
		Queue<Character> mq = new LinkedList<> ();
		Queue<Character> cq = new LinkedList<> ();
		
		for(int i = 0; i < m.length(); i++) {
			mq.offer(m.charAt(i));
		}
		for(int i = 0; i < c.length(); i++) {
			cq.offer(c.charAt(i));
		}
		
		while(!cq.isEmpty() && !mq.isEmpty()) {
			char mc = mq.peek();
			char cc = cq.peek();
			
			if(mc == cc) {
				mq.poll();
				cq.poll();
			} else {
				while(!cq.isEmpty() && mq.peek() != cq.peek()) {
					cq.poll();
				}
			}
		}
		
		if(mq.size() > 0) 
			System.out.println("NO");
		else
			System.out.println("YES");
		return;
	}
}
