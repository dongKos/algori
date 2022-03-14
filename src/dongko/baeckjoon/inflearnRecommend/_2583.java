package dongko.baeckjoon.inflearnRecommend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @title 영역구하기
 * @author dhkim
 * @date 2022. 3. 14.
 * @link https://www.acmicpc.net/problem/2583
 */
public class _2583 {

	static int[][] ch;
	static int n;
	static int m;
	static int cnt;
	static int bigCnt;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<> ();

		try {
			String str[] = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			m = Integer.parseInt(str[1]);
			int k = Integer.parseInt(str[2]);
			ch = new int[n][m];
			for(int i = 0; i < k; i++) {
				String temp[] = br.readLine().split(" ");
				
				int x1 = Integer.parseInt(temp[1]);
				int y1 = Integer.parseInt(temp[0]);
				int x2 = Integer.parseInt(temp[3]);
				int y2 = Integer.parseInt(temp[2]);
				
				for(int l = x1; l < x2; l++) {
					for(int j = y1; j < y2; j++) {
						ch[l][j] = 1;
					}
				}
			}
			
			for(int i = 0; i < ch.length; i++) {
				for(int j = 0; j < ch[i].length; j++)
					if(ch[i][j] == 0) {
						bigCnt++;
						cnt = 0;
						ch[i][j] = 1;
						dfs(i, j);
						list.add(cnt);
					}
			}

			System.out.println(bigCnt);
			Collections.sort(list);
			for(int num : list)
				System.out.print(num + " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void dfs(int x, int y) {
		cnt++;
		boolean movable = false;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(0 <= nx && nx < n && 0 <= ny && ny < m && ch[nx][ny] == 0) {
				movable = true;
				break;
			}
		}
		
		if(movable) {
			for(int i = 0; i < dx.length; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(0 <= nx && nx < n && 0 <= ny && ny < m && ch[nx][ny] == 0) {
					ch[nx][ny] = 1;
					dfs(nx, ny);
//					ch[nx][ny] = 0;
				}
			}
		}
	}
}
