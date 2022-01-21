package dongko.inflearn.hash_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @title 매출액의 종류
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/04-03
 */
public class TypeOfSales_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int [] n = new int [N];
		for(int i = 0; i < N; i++) {
			n[i] = in.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<> ();
		for(int i = 0; i < M; i++) {
			map.put(n[i], i);
		}
		System.out.print(map.keySet().size() + " ");
		
		for(int i = M; i < N; i++) {
			if(map.get(n[i-M]) == i-M)
				map.remove(n[i-M]);
			map.put(n[i], i);
			System.out.print(map.keySet().size() + " ");
		}
		return;
	}
}
