package dongko.baeckjoon.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title 덩치 
 * @date 2022. 1. 15.
 * @author ibank
 * @link https://www.acmicpc.net/problem/7568
 */
public class Bulk {
	
	public static void main(String [] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			Integer [][] p = new Integer [N][2];
			for(int i = 0; i < N; i++){ 
				String [] body = br.readLine().split(" ");
				int x = Integer.parseInt(body[0]);
				int y = Integer.parseInt(body[1]);
				Integer [] bodyArr = {x, y};
				p[i] = bodyArr;
			}
			for(int i = 0; i < p.length; i++) {
				int cnt = 0;
				int myX = p[i][0];
				int myY = p[i][1];
				
				for(int j = 0; j < p.length; j++) {
					int otherX = p[j][0];
					int otherY = p[j][1];
					
					if(myX < otherX && myY < otherY) cnt ++;
				}
				System.out.print((cnt+1) + " ");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
