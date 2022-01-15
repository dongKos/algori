package dongko.baeckjoon.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @title 프린터 큐 
 * @date 2022. 1. 15.
 * @author ibank
 * @link https://www.acmicpc.net/problem/1966
 */
public class PrinterQueue {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int K = Integer.parseInt(br.readLine());
			ArrayList<Integer> result = new ArrayList<> ();
			for(int i = 0; i < K; i++) {
				String [] nm = br.readLine().split(" ");
				int N = Integer.parseInt(nm[0]);
				int M = Integer.parseInt(nm[1]);
				
				Queue<Character> q = new LinkedList<> ();
				for(int j = 0; j < N; j++) {
					q.offer((char) ('A'+j));
				}
				HashMap<Character, Integer> priority = new HashMap<> ();
				
				ArrayList<Integer> n = new ArrayList<> ();
				String [] ns = br.readLine().split(" ");
				char idx = 'A';
				for(String s : ns) {
					priority.put((char)(idx++), Integer.parseInt(s));
					n.add(Integer.parseInt(s));
				}
				Collections.sort(n);
				//출력할 문서
				char P = (char)('A'+M);
				
				int printCnt = 0;
				while(!q.isEmpty()) {
					int maxP = n.get(n.size()-1);
					
					char first = q.poll();
					
					if(maxP == priority.get(first)) {
						printCnt++;
						n.remove(n.size()-1);
						if(first == P) break;
					} else {
						q.offer(first);
					}
				}
				result.add(printCnt);
			}
			for(int num : result)
				System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
