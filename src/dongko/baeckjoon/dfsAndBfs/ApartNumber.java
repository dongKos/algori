package dongko.baeckjoon.dfsAndBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApartNumber {
	public static int[][] aparts;

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(br.readLine());
			aparts = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] a = br.readLine().split("");

				for (int j = 0; j < a.length; j++) {
					aparts[i][j] = Integer.parseInt(a[j]);
				}
			}

			for (int i = 0; i < aparts.length; i++) {
				for (int j = 0; j < aparts[i].length; j++) {
					System.out.print(aparts[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
