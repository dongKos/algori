package dongko.inflearn.StackQueue_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title ¿¿±ﬁΩ«
 * @author dhkim
 * @date 2022. 1. 22.
 * @link https://cote.inflearn.com/contest/10/problem/05-08
 */
public class EmergencyRoom_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<> ();
		Queue<HashMap<String, Integer>> q = new LinkedList<> ();
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			int p = in.nextInt();
			list.add(p);
			HashMap<String, Integer> tmpMap = new HashMap<> ();
			tmpMap.put("idx", i);
			tmpMap.put("p", p);
			q.offer(tmpMap);
			if(max < p) max = p;
		}
		Collections.sort(list);
		int cnt = 0, answer = 0;
		while(!q.isEmpty()) {
			HashMap<String, Integer> person = q.poll();
			if(person.get("p") != list.get(list.size()-1)) {
				q.offer(person);
			} else {
				list.remove(list.size()-1);
				cnt++;
				if(person.get("idx") == M) answer = cnt;
			}
		}
		System.out.println(answer);
		return;
	}
}
