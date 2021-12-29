package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @title 회의실 배정
 * @author dhkim
 * @date 2021. 12. 29.
 * @link https://www.acmicpc.net/problem/1931
 */
public class MeetingRoomAssign {
	//다시 풀어볼 문제
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(br.readLine());
			int [][] tArr = new int [n][2];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				int s = Integer.parseInt(line.split(" ")[0]);
				int e = Integer.parseInt(line.split(" ")[1]);
				tArr[i][0] = s;
				tArr[i][1] = e;
			}
			
			Arrays.sort(tArr, new Comparator<int []>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]) return o1[0] - o2[0];
					return o1[1] - o2[1];
				}
				
			});

			int cnt = 0;
			int prvEndTime = 0;
			for(int i = 0; i < n; i++) {
				
				if(prvEndTime <= tArr[i][0]) {
					prvEndTime = tArr[i][1];
					cnt++;
				}
			}
			bw.write(cnt + "\n");
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
