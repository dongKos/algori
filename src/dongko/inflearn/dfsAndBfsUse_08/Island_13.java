package dongko.inflearn.dfsAndBfsUse_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @title 섬나라 아일랜드
 * @author dongko
 * @date 2022. 2. 21.
 * @link https://cote.inflearn.com/contest/10/problem/08-13
 */
public class Island_13 {
	static class Coordinate {
		int x;
		int y;
		
		public Coordinate (int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static int n;
	static int[][] arr;
	static int[][] ch;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("수정");
		System.out.println("수정");
		n = in.nextInt();
		arr = new int[n][n];
		ch = new int[n][n];
		int answer = 0;
		List<Coordinate> list = new ArrayList<> ();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
				if(arr[i][j] == 1)
					list.add(new Coordinate(i, j));
			}
		}
		for(int i = 0; i < list.size(); i++) {
			Coordinate cur = list.get(i);
			if(ch[cur.x][cur.y] == 0 ) {
				answer++;
				ch[cur.x][cur.y] = 1; 
				dfs(cur);
			}
		}
		System.out.println(answer);
		return;
	}
	private static void dfs(Coordinate start) {
		boolean canSearch = false;
		
		for(int i = 0; i < dx.length; i++) {
			int nx = start.x+dx[i];
			int ny = start.y+dy[i];
			if(0 <= nx && nx < n && 0 <= ny && ny < n && arr[nx][ny] == 1 && ch[nx][ny] != 1) {
				canSearch = true;
			}
		}
		
		if(canSearch) {
			for(int i = 0; i < dx.length; i++) {
				int nx = start.x+dx[i];
				int ny = start.y+dy[i];
				if(0 <= nx && nx < n && 0 <= ny && ny < n && arr[nx][ny] == 1 && ch[nx][ny] != 1) {
					ch[nx][ny] = 1;
					dfs(new Coordinate(nx, ny));
				}
			}
		}
		
	}
}
