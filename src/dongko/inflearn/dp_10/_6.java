package dongko.inflearn.dp_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @title 최대점수 구하기(냅색 알고리즘)
 * @author dhkim
 * @date 2022. 3. 11.
 * @link https://cote.inflearn.com/contest/10/problem/10-06
 */
public class _6 {

	//중복을 허용하지 않는 경우는 뒤에서부터 탐색
	static class Problem {
		int s;
		int t;
	}
	static int[] dy;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		dy = new int[m+1];
		ArrayList<Problem> list = new ArrayList<> ();
		for(int i = 0; i < n; i++) {
			Problem p = new Problem();
			p.s = in.nextInt();
			p.t = in.nextInt();
			list.add(p);
		}
		list.sort(new Comparator<Problem> () {
			@Override
			public int compare(Problem o1, Problem o2) {
				return o1.t - o2.t;
			}
		});
		for(int i = 0; i < list.size(); i++) {
			for(int j = dy.length-1; j >= list.get(i).t; j--) {
				dy[j] = Math.max(dy[j], dy[j - list.get(i).t] + list.get(i).s);
			}
		}
		
		System.out.println(dy[m]);
	}
}
