package dongko.baeckjoon.inflearnRecommend;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 스타트와 링크
 * @author dhkim
 * @date 2022. 3. 14.
 * @link https://www.acmicpc.net/problem/14889
 */
public class _14889 {

	static int[][] arr;
	static int n;
	static int[] ch;
	static int answer = Integer.MAX_VALUE;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			ch = new int[n];
			
			for(int i = 0; i < n; i++) {
				String[] temp = br.readLine().split(" ");
				for(int j = 0; j < temp.length; j++) {
					arr[i][j] = Integer.parseInt(temp[j]);
				}
			}
			
			dfs(0, 0);
			System.out.println(answer);
		} catch (Exception e) {

		}
	}

	private static void dfs(int level, int start) {
		if(level == n/2) {
			int team_start = 0;
			int team_link = 0;
	 
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (ch[i] == 1 && ch[j] == 1) {
						team_start += arr[i][j];
						team_start += arr[j][i];
					}
					else if (ch[i] == 0 && ch[j] == 0) {
						team_link += arr[i][j];
						team_link += arr[j][i];
					}
				}
			}
			int val = Math.abs(team_start - team_link);
			if (val == 0) {
				System.out.println(val);
				System.exit(0);
			}
			
			answer = Math.min(val, answer);
		} else {
			for(int i = start; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					dfs(level+1, i);
					ch[i] = 0;
				}
			}
		}
	}
}
