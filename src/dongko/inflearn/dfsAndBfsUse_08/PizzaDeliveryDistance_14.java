package dongko.inflearn.dfsAndBfsUse_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @title 피자배달거리
 * @date 2022. 2. 22.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/08-14
 */
public class PizzaDeliveryDistance_14 {
	static int n;
	static int m;
	static int answer = Integer.MAX_VALUE;
	static int[][]arr;
	static int[][] ch;
	static List<Coordinate> ps, hs;
	static int [] combi;
	static class Coordinate {
		int x;
		int y;
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n][n];
		ch = new int[n][n];
		combi = new int [m];
		ps = new ArrayList<> ();
		hs = new ArrayList<> ();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j]=in.nextInt();
				if(arr[i][j] == 2) ps.add(new Coordinate(i, j));
				else if(arr[i][j] == 1) hs.add(new Coordinate(i, j));
			}
		}
		dfs(0, 0);
		System.out.println(answer);
	}
	
	private static void dfs(int level, int start) {
		if(level == m) {
			getMinDeliDist();
		} else {
			for(int i = start; i < ps.size(); i++) {
				combi[level] = i;
				dfs(level+1, i+1);
			}
		}
	}
	
	private static void getMinDeliDist() {
		int sum = 0;
		for(Coordinate house : hs) {
			int dist = Integer.MAX_VALUE;
			
			for(int x : combi) {
				Coordinate pizza = ps.get(x);
				dist = Math.min(dist, Math.abs(house.x - pizza.x) + Math.abs(house.y - pizza.y));
			}
			sum += dist;
		}
		answer = Math.min(answer, sum);
	}
}
