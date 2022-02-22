package dongko.inflearn.dfsAndBfsUse_08;

import java.util.Scanner;

/**
 * @title 미로탐색
 * @author dongko
 * @date 2022. 2. 9.
 * @link
 */
@SuppressWarnings("resource")
public class Mazeexploration_10 {
	static int [][] arr = new int [7][7];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		arr[0][0] = 1;
		dfs(0,0);
		System.out.println(cnt);
		return;
	}
	
	static int [] dx = {-1, 0, 1, 0};
	static int [] dy = {0, 1, 0, -1};
	static int cnt = 0;
	private static void dfs(int i, int j) {
		if(i == 6 && j ==6) {
			cnt++;
		} else {
			for(int x = 0; x < dx.length; x++) {
				int newX = i+dx[x];
				int newY = j+dy[x];
				
				if( (newX >= 0 && newY >= 0) && (newX <= 6 && newY <= 6) && arr[newX][newY] != 1) {
					arr[newX][newY] = 1;
					dfs(newX, newY);
					arr[newX][newY] = 0;
				}
			}
		}
		
	}
}
