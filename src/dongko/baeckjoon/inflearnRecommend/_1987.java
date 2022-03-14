package dongko.baeckjoon.inflearnRecommend;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 알파벳
 * @author dhkim
 * @date 2022. 3. 14.
 * @link https://www.acmicpc.net/problem/1987
 */
public class _1987 {

	static char[][] arr;
	static int r, c;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static boolean[] ch;
	static int answer;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] temp = br.readLine().split(" ");
			r = Integer.parseInt(temp[0]);
			c = Integer.parseInt(temp[1]);
			arr = new char[r][c];
			ch = new boolean[100];

			for (int i = 0; i < r; i++) {
				char[] tmp = br.readLine().toCharArray();
				for (int j = 0; j < tmp.length; j++) {
					arr[i][j] = tmp[j];
				}
			}

			ch[arr[0][0]] = true;
			dfs(0, 0, 0);
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void dfs(int x, int y, int depth) {
		boolean movable = false;

		for (int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (0 <= nx && nx < r && 0 <= ny && ny < c && ch[arr[nx][ny]] == false) {
				movable = true;
				break;
			}
		}
		if(movable) {
			for (int i = 0; i < dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (0 <= nx && nx < r && 0 <= ny && ny < c && ch[arr[nx][ny]] == false) {
					ch[arr[nx][ny]] = true;
					dfs(nx, ny, depth+1);
					ch[arr[nx][ny]] = false;
				}
			}
		} else {
			int tempCnt = 0;
			for(int i = 65; i <= 90; i++) {
				if(ch[i] == true) tempCnt++;
			}
			answer = Math.max(answer, tempCnt);
		}
	}
}
