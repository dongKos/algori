package dongko.inflearn.arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title 멘토링
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/02-12
 */
public class Mentoring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.nextLine();
		
		int [] [] n = new int [M][N];
		for(int i = 0; i < n.length; i++) {
			String [] s = in.nextLine().split(" ");
			
			for(int j = 0; j < n[i].length; j++) {
				n[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		HashMap<String, Integer> map = new HashMap<> ();
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				
				for(int k = j+1; k < n[i].length; k++) {
					String key = n[i][j] + ", " + n[i][k];
					if(map.get(key) == null) map.put(key, 0);
					map.put(key, map.get(key)+1);
				}
			}
		}
		
		int cnt = 0;
		for(String key : map.keySet()) {
			if(map.get(key) == M) cnt++;
		}
		System.out.println(cnt);
		
		return;
	}
}
