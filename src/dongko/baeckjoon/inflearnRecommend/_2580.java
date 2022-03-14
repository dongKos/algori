package dongko.baeckjoon.inflearnRecommend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @title 스도쿠
 * @author dhkim
 * @date 2022. 3. 14.
 * @link https://www.acmicpc.net/problem/2580
 */
public class _2580 {
	static int[][] sdoku = new int[9][9];
	static int zeroCnt;
	static ArrayList<P> list = new ArrayList<> ();
	static class P {
		int x;
		int y;
		
		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "P [x=" + x + ", y=" + y + "]";
		}
		
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int i = 0; i < 9; i++) {
				String[] temp = br.readLine().split(" ");
				for(int j = 0; j < 9; j++) {
					sdoku[i][j] = Integer.parseInt(temp[j]);
					if(sdoku[i][j] == 0) {
						zeroCnt++;
						list.add(new P(i, j));
					}
				}
			}
			while(zeroCnt != 0)
			for(int i = 0; i < list.size(); i++) {
				ArrayList<String> tempx = new ArrayList<> ();
				ArrayList<String> tempy = new ArrayList<> ();
				ArrayList<String> tempt = new ArrayList<>();
				for(int t = 0; t < 10; t++) {
					tempx.add(t+"");
					tempy.add(t+"");
					tempt.add(t+"");
				}
				
				P p = list.get(i);
				int x = p.x;	//1
				int y = p.y;	//4
				for(int j = 0; j < 9; j++) {
					tempx.remove(sdoku[j][y]+"");
					tempy.remove(sdoku[x][j]+"");
				}
				if(tempx.size() == 1)  {
					zeroCnt--;
					sdoku[x][y] = Integer.parseInt(tempx.get(0));
				}
				else if(tempy.size() == 1)  {
					zeroCnt--;
					sdoku[x][y] = Integer.parseInt(tempy.get(0));
				}
				
				if(sdoku[x][y] == 0) {
					int xs = 0, xe = 0, ys = 0, ye = 0;
					//1
					if(0 <= x && x <= 2 && 0 <= y && y <= 2) {
						xs=0; xe=2; ys=0; ye=2;
					}
					//2
					else if(0 <= x && x <= 2 && 3 <= y && y <= 5) {
						xs=0; xe=2; ys=3; ye=5;
					}
					//3
					else if(0 <= x && x <= 2 && 6 <= y && y <= 8) {
						xs=0; xe=2; ys=6; ye=8;
					}
					//4
					else if(3 <= x && x <= 5 && 0 <= y && y <= 2) {
						xs=3; xe=5; ys=0; ye=2;
					}
					//5
					else if(3 <= x && x <= 5 && 3 <= y && y <= 5) {
						xs=3; xe=5; ys=3; ye=5;
					}
					//6
					else if(3 <= x && x <= 5 && 6 <= y && y <= 8) {
						xs=3; xe=5; ys=6; ye=8;
					}
					//7
					else if(6 <= x && x <= 8 && 0 <= y && y <= 2) {
						xs=6; xe=8; ys=0; ye=2;
					}
					//8
					else if(6 <= x && x <= 8 && 3 <= y && y <= 5) {
						xs=6; xe=8; ys=3; ye=5;
					}
					//9
					else if(6 <= x && x <= 8 && 6 <= y && y <= 8) {
						xs=6; xe=8; ys=6; ye=8;
					}
					
					for(int l = xs; l <= xe; l++) {
						for(int k = ys; k <= ye; k++) {
							tempt.remove(sdoku[l][k]+"");
						}
					}
					if(tempt.size() == 1) {
						zeroCnt--;
						sdoku[x][y] = Integer.parseInt(tempt.get(0));
					}
				}
			}
			
			for(int i = 0; i < sdoku.length; i++) {
				for(int j = 0; j < 9; j++) {
					System.out.print(sdoku[i][j] + " ");
				}
				System.out.println();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
