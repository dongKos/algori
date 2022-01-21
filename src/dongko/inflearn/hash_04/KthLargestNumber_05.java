package dongko.inflearn.hash_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

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
		TreeSet<Integer> tSet = new TreeSet<> (Collections.reverseOrder());
		for(int i = 0; i < N; i++) 
			for(int j = i+1; j < N; j++) 
				for(int k = j+1; k < N; k++) 
					tSet.add(n[i] + n[j] + n[k]);
		int cnt = 0;
		int answer = -1;
		for(int num : tSet)
			if(++cnt == K) {
				answer = num;
				break;
			}
		System.out.println(answer);
		return;
	}
}
