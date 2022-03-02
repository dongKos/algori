package dongko.baeckjoon.dfsAndBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 미로탐색 
 * @date 2022. 2. 22.
 * @author ibank
 * @link https://www.acmicpc.net/problem/2178
 */
public class _2178 {
	static int n, m;
	static int[][] arr;
	static int[][] ch;
	static int[][] dist;
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	
	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		arr = new int [n][m];
		ch = new int [n][m];
		dist = new int [n][m];
		for(int i = 0; i < n; i++) {
			String str = in.next();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		ch[0][0] = 1;
		dist[0][0]=1;
		dfs(new Point(0, 0));
		System.out.println(dist[n-1][m-1]);
	}
	
	private static void dfs(Point point) {
		Queue<Point> q = new LinkedList<> ();
		q.offer(point);
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for(int i = 0; i < size; i++) {
				Point cur = q.poll();
				for(int k = 0; k < dx.length; k++) {
					int nx = cur.x+dx[k];
					int ny = cur.y+dy[k];
					if(0 <= nx && nx < n && 0 <= ny && ny < m && ch[nx][ny] == 0 && arr[nx][ny] == 1) {
						ch[nx][ny] = 1;
						q.offer(new Point(nx, ny));
						dist[nx][ny] = dist[cur.x][cur.y]+1;
					}
				}
				
			}
		}
	}
}
