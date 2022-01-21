package dongko.inflearn.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title 두 배열 합치기
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/03-01
 */
public class TwoArrayUnion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		int[] n = new int[N];
		for (int i = 0; i < N; i++) {
			n[i] = in.nextInt();
		}
		in.nextLine();
		int M = in.nextInt();
		int[] m = new int[M];
		for (int i = 0; i < M; i++) {
			m[i] = in.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < N && p2 < M) {
			if (n[p1] < m[p2])
				list.add(n[p1++]);
			else if (m[p2] < n[p1])
				list.add(m[p2++]);
			else {
				list.add(n[p1++]);
				list.add(m[p2++]);
			}
		}
		if (p1 < n.length) {
			for (int i = p1; i < n.length; i++)
				list.add(n[i]);

		}
		if (p2 < m.length) {
			for (int i = p2; i < m.length; i++)
				list.add(m[i]);

		}
		for (int num : list)
			System.out.print(num + " ");
		return;
	}
}
