package dongko.inflearn.arrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @title 임시반장 정하기
 * @author dongko
 * @date 2022. 1. 20.
 * @link https://cote.inflearn.com/contest/10/problem/02-11
 */
public class TempClassCaptain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		int [][] n = new int [N][];

		for(int i = 0; i < N; i++) {
			String [] s = in.nextLine().split(" ");
			n[i] = new int[s.length];
			for(int j = 0; j < s.length; j++) {
				n[i][j] = Integer.parseInt(s[j]);
			}
		}
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<> ();
		int max = 0;
		for(int i = 0; i < n.length; i++) {
			map.put(i, 0);
			for(int j = 0; j < n[i].length; j++) {
				int c = n[i][j];
				
				for(int k = 0; k < 5; k++) {
//					System.out.println("j : " + j + " k : " + k + " c : " + c + " n[k][j] : " + n[k][j]);
					if(k != i && n[i][k] == n[j][k]) {
						map.put(i, map.get(i) + 1);
					}
				}
//				System.out.println(map);
			}
			if(max < map.get(i)) max = map.get(i); 
		}
		
		for(int key : map.keySet()) {
			if(max == map.get(key)) {
				System.out.println(key+1);
				break;
			}
		}
		return;
	}
}
