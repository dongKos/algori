package dongko.inflearn.StackQueue_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 공주 구하기
 * @author dhkim
 * @date 2022. 1. 22.
 * @link https://cote.inflearn.com/contest/10/problem/05-06
 */
public class SaveThePrincess_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		Queue<Integer> q = new LinkedList<> ();
		
		for(int i = 1; i <= N; i++) 
			q.offer(i);
		
		int cnt = 0;
		while(q.size() > 1) {
			int p = q.poll();
			cnt++;
			if(cnt != K) q.offer(p);
			else cnt = 0;
		}
		System.out.println(q.poll());
		return;
	}
}
