package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 미로탐색
 * @author dongko
 * @date 2022. 2. 9.
 * @link https://cote.inflearn.com/contest/10/problem/08-10
 */
public class Mazeexploration_10 {
	static int [][] arr = new int [8][8];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		arr[1][1] = 1;
		dfs(1,1);
		System.out.println(cnt);
		return;
	}
	
	static int [] dx = {-1, 0, 1, 0};
	static int [] dy = {0, 1, 0, -1};
	static int cnt = 0;
	private static void dfs(int i, int j) {
		if(i == 7 && j == 7) {
			cnt++;
		} else {
			for(int x = 0; x < 4; x++) {
				int newX = i+dx[x];
				int newY = j+dy[x];
				
				if( newX >= 1 && newY >= 1 && newX <= 7 && newY <= 7 && arr[newX][newY] == 0) {
					arr[newX][newY] = 1;
					dfs(newX, newY);
					arr[newX][newY] = 0;
				}
			}
		}
		
	}
}
