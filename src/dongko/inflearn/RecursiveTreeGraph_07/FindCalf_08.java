package dongko.inflearn.RecursiveTreeGraph_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 송아지 찾기
 * @author dongko
 * @date 2022. 1. 28.
 * @link https://cote.inflearn.com/contest/10/problem/07-08
 */
public class FindCalf_08  {
	static int m;
	static boolean [] checked;
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		m = in.nextInt();
		checked = new boolean [10001];
		bfs(n);
		return;
	}

	private static void bfs(int n) {
		Queue<Integer> q = new LinkedList<> ();
		q.offer(n);
		checked[n] = true;
		int level = 0;
		boolean escape = false;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				int curr = q.poll();
				if(curr == m) {
					escape = true;
					break;
				} 
				if(curr-1 > 0 && curr-1 < 10000 && !checked[curr-1]) {
					q.offer(curr-1);
					checked[curr-1] = true;
				}
				if(curr+1 > 0 && curr+1 < 10000 && !checked[curr+1]) {
					q.offer(curr+1);
					checked[curr+1] = true;
				}
				if(curr+5 > 0 && curr+5 < 10000 && !checked[curr+5]) {
					q.offer(curr+5);
					checked[curr+5] = true;
				}
			}
			if(escape) break;
			level++;
		}
		System.out.println(level);
	}

}
