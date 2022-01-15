package dongko.baeckjoon.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @title 통계학 
 * @date 2022. 1. 15.
 * @author ibank
 * @link https://www.acmicpc.net/problem/2108
 */
public class Statistics {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<> ();
			HashMap<Integer, Integer> map = new HashMap<> ();
			int min = 0, max = 0, sum = 0;
			for(int i = 0; i < N; i++) {
				int val = Integer.parseInt(br.readLine());
				if(i == 0) {
					min = max = val;
				} else {
					if(min > val) min = val;
					if(max < val) max = val; 
				}
				list.add(val);
				if(map.get(val) == null) 
					map.put(val, 0);
				map.put(val, map.get(val) + 1);
				sum += val;
			}
			Collections.sort(list);
			
			HashMap<Integer, TreeSet<Integer>> midMap = new HashMap<> ();
			int midMax = 1;
			for(int num : map.keySet()) {
				int val = map.get(num);
				if(val > midMax) midMax = val;
				if(midMap.get(val) == null) midMap.put(val, new TreeSet<Integer> ());
				midMap.get(val).add(num);
			}
			
			int avg = (int) Math.rint((double) sum / list.size());
			int mid = list.get((N/2+1)-1);
			int range = max - min;
			
			System.out.println(avg);
			System.out.println(mid);
			if(midMap.get(midMax).size() > 1) {
				midMap.get(midMax).pollFirst();
				System.out.println(midMap.get(midMax).pollFirst());
			} else {
				System.out.println(midMap.get(midMax).first());
			}
			System.out.println(range);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
