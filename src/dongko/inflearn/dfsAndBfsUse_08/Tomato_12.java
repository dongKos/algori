package dongko.inflearn.dfsAndBfsUse_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 토마토
 * @author dongko
 * @date 2022. 2. 21.
 * @link https://cote.inflearn.com/contest/10/problem/08-12
 */
public class Tomato_12 {

	static class Coordinate {
		int x;
		int y;
		
		public Coordinate () {}
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n;
	static int m;
	static int day;
	static int [][] ch;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int [m][n];
		ch = new int [Math.max(m, n)][Math.max(m, n)];
		int answer = 10;
		
		List<Coordinate> startList = new ArrayList<> ();
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
				if(arr[i][j] == 1) 
					startList.add(new Coordinate(i, j));
			}
		}
		
		int zeroCnt = 0;
		int oneCnt = 0;
		boolean canRipe = true;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					zeroCnt++;
					int minusCnt = 0;
					
					for(int k = 0; k < dx.length; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if(0 <= nx && nx < m && 0 <= ny && ny < n) {
							if(arr[nx][ny] == -1)
								minusCnt++;
						} else {
							minusCnt++;
						}
					}
					
					if(minusCnt == 4) canRipe = false;
				} else if(arr[i][j] == 1) {
					oneCnt++;
				}
			}
		}
		if(canRipe == false || oneCnt == 0) answer = - 1;
		if(zeroCnt == 0) answer = 0;
		
		if(answer != -1 && answer != 0) {
			startList.forEach(c->ch[c.x][c.y]=1);
			bfs(startList);
			
			System.out.println(day-1);
		} else {
			System.out.println(answer);
		}
		return;
	}
	
	private static void bfs(List<Coordinate> startList) {
		Queue<Coordinate> q = new LinkedList<> ();
		startList.forEach(c -> q.offer(c));
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for(int i = 0; i < size; i++) {
				Coordinate cur = q.poll();
				
				for(int k = 0; k < dx.length; k++) {
					int nx = cur.x+dx[k];
					int ny = cur.y+dy[k];
					if(0 <= nx && nx < m && 0 <= ny && ny < n && arr[nx][ny] == 0 && ch[nx][ny] == 0) {
						ch[nx][ny] = 1;
						q.offer(new Coordinate(nx, ny));
					} 
				}
			}
			day++;
		}
	}
}
