package dongko.inflearn.hash_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @title K번째 큰 수
 * @date 2022. 1. 21.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/04-05
 */
public class KthLargestNumber_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int [] n = new int [N];
		for(int i = 0; i < N; i++) {
			n[i] = in.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<> ();
		for(int i = 0; i < N; i++) 
			for(int j = 0; j < N; j++) 
				for(int k = 0; k < N; k++) 
					if(i != j && i != k && j != k) 
						map.put(n[i] + n[j] + n[k], 0);
		
		ArrayList<Integer> sums = new ArrayList<> (map.keySet());
		Collections.sort(sums, Collections.reverseOrder());
		System.out.println((K-1 > sums.size())?-1:sums.get(K-1));
		return;
	}
}
