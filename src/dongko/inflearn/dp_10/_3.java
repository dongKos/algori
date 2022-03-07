package dongko.inflearn.dp_10;

import java.util.Scanner;

/**
 * @title 최대 부분 증가 수열
 * @author dongko
 * @date 2022. 3. 7.
 * @link https://cote.inflearn.com/contest/10/problem/10-03
 */
public class _3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] dy = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		dy[0] = 1;
		int answer = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j] && dy[j] > max) max = dy[j];
			}
			dy[i] = max + 1;
			if (dy[i] > answer) answer = dy[i];
		}

		System.out.println(answer);
	}
}
