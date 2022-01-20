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
		int [][] n = new int [N][N];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				n[i][j] = in.nextInt();
			}
		}
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<> ();
		for(int i = 0; i < N; i++) {
			map.put(i, 0);
			for(int j = 0; j < N; j++) {
				int c = n[i][j];
				
				for(int k = 0; k < N; k++) {
					System.out.println("C : " + c + " n[k][j] : " + n[k][j]);
					if(c == n[k][j]) {
						map.put(i, map.get(i) + 1);
					}
				}
				System.out.println();
			}
			System.out.println(map);
		}
		System.out.println(map);
		int max = map.get(0);
		int sNum = 0;
		for(int key : map.keySet()) {
			System.out.println("key : " + key + " val : " + map.get(key));
			if(max < map.get(key)) {
				max = map.get(key);
				sNum = key;
			}
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
