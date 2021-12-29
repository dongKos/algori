package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


/**
 * @title µ¿Àü 0
 * @author dhkim
 * @date 2021. 12. 29.
 * @link https://www.acmicpc.net/problem/11047
 */
public class Coin0 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String line1 = br.readLine();
			int n = Integer.parseInt(line1.split(" ")[0]);
			int k = Integer.parseInt(line1.split(" ")[1]);

			ArrayList<Integer> coins = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				coins.add(Integer.parseInt(line));
			}

			int s = 0;
			for (int i = coins.size() - 1; i >= 0; i--) {
				if (coins.get(i) <= k) {
					s = s + k / coins.get(i);
					k = k % coins.get(i);
				}
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
