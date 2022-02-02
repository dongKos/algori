package dongko.inflearn.dfsAndBfsUse_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @title 합이 같은 부분집합
 * @author dongko
 * @date 2022. 2. 2.
 * @link https://cote.inflearn.com/contest/10/problem/08-01
 */
public class SubsetWithSameSum_01 {

	static int n;
	static int [] arr;
	static int total;
	static ArrayList<Integer> ch = new ArrayList<> ();
	static LinkedList<Integer> ex = new LinkedList<> ();
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int [n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			ex.add(arr[i]);
			total += arr[i];
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			ch.add(arr[i]);
//			ex.remove(Integer.valueOf(arr[i]));
//			dfs(arr[i]);
//		}
		ch.add(arr[0]);
		dfs(0, arr[0]);
		System.out.println("NO");
		return;
	}
	private static void dfs(int idx, int sum) throws Exception {
		if(idx == n) {
			if(total-sum==sum) {
				System.out.println("YES");
				System.exit(0);
			}
		} else {
			ch.add(arr[idx]);
			dfs(idx+1, sum+arr[idx]);
			
			ch.remove(ch.size()-1);
			dfs(idx+1, sum);
		}
	}
	
	//개같은 내풀이
//	private static void dfs(int num) {
//		if(ch.size() == n) {
//			
//		} else {
//			int sum1 = ex.stream().reduce(0, Integer::sum);
//			int sum2 = ch.stream().reduce(0, Integer::sum);
//			if(sum1 == sum2) {
//				System.out.println("YES");
//				System.exit(0);
//			}
//			for(int i = 0; i < arr.length; i++) {
//				
//				if(arr[i] != num && !ch.contains(arr[i])) {
//					ch.add(arr[i]);
//					ex.remove(Integer.valueOf(arr[i]));
//					dfs(arr[i]);
//					ch.remove(ch.size()-1);
//					ex.add(arr[i]);
//				}
//			}
//			
//		}
//	}
}
