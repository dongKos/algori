package dongko.inflearn.sortingAndSearching_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @title 좌표정렬
 * @date 2022. 1. 25.
 * @author ibank
 * @link cote.inflearn.com/contest/10/problem/06-07
 */
public class CoordinateSorting_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Integer[][] arr = new Integer[n][2];
		for (int i = 0; i < n; i++) {
			String[] s = in.nextLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}

		Arrays.sort(arr, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if (o1[0].equals(o2[0])) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0] + " ");
			System.out.print(arr[i][1]);
			System.out.println();
		}
		return;
	}
}
