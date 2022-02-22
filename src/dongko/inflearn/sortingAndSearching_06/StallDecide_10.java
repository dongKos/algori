package dongko.inflearn.sortingAndSearching_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 마구간 정하기 
 * @author dongko
 * @date 2022. 1. 27.
 * @link https://cote.inflearn.com/contest/10/problem/06-10
 */
public class StallDecide_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		int lt = 1, rt = Arrays.stream(arr).max().getAsInt();
		
		int answer = 0;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			
			if(count(arr, mid) < m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
				answer = mid;
			}
			
		}
		System.out.println(answer);
		return;
	}

	private static int count(int[] arr, int mid) {
		int cnt = 1;
		int ep = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
}
