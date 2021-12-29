package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

/**
 * @title 보물찾기
 * @author dhkim
 * @date 2021. 12. 29.
 * @link https://www.acmicpc.net/problem/1026
 */
public class Treasure {

	//Arrays.sort의 이해가 필요
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(br.readLine());
			String[] aStr = br.readLine().split(" ");
			String[] bStr = br.readLine().split(" ");

			int[] a = new int[n];
			Integer[] b = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(aStr[i]);
				b[i] = Integer.parseInt(bStr[i]);
			}
			Arrays.sort(a);
			
			Arrays.sort(b, Collections.reverseOrder());

			int s = 0;
			for (int i = 0; i < n; i++) {
				s += a[i] * b[i];
			}

			bw.write(s + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
