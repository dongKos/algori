package dongko.inflearn.dfsAndBfsUse_08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title 미로의 최단거리 통로
 * @author dongko
 * @date 2022. 2. 17.
 * @link 
 */
public class MazeShortestPath_11 {
	public static class Coordinate {
		public int x;
		public int y;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
	
	static int [][] arr = new int [7][7];
	static int [][] dis = new int [7][7];
	static Queue<Coordinate> q = new LinkedList<> ();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		arr[0][0] = 1;
		q.offer(new Coordinate(0, 0));
		bfs(0, 0);
		
		System.out.println(dis[6][6]==0?-1:dis[6][6]);
	}
	static int [] dx = {-1, 0, 1, 0};
	static int [] dy = {0, 1, 0, -1};
	private static void bfs(int x, int y) {
		while(!q.isEmpty()) {
			Coordinate curC = q.poll();
			if(curC.x == 6 && curC.y ==6) break;
			for(int i = 0; i < 4; i++) {
				int nx = curC.x+dx[i];
				int ny = curC.y+dy[i];
				
				if(0 <= nx && nx <= 6 && 0 <= ny && ny <= 6 && arr[nx][ny] == 0) {
					arr[nx][ny] = 1;
					dis[nx][ny] = dis[curC.x][curC.y] + 1;
					q.offer(new Coordinate(nx, ny));
				}
			}
		}
	}
	
}
