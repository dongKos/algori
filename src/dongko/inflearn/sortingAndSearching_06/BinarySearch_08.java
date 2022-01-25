package dongko.inflearn.sortingAndSearching_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 이분검색(탐색)
 * @date 2022. 1. 25.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/06-08
 */
public class BinarySearch_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		
		int lt = 0, rt = arr.length-1;
		int mid = (lt + rt) / 2;
		
		while(arr[mid] != m) {
			if(arr[mid] > m) rt = mid-1;
			else if(arr[mid] < m) lt = mid+1;
			mid = (lt + rt) / 2;
		}
		System.out.println(mid+1);
		
		return;
	}
}
