package dongko.inflearn.sortingAndSearching_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 뮤직비디오(결정 알고리즘)
 * @date 2022. 1. 27.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/06-09
 */
public class MusicVideo_09 {

	public static int getCnt(int [] arr, int capacity) {
		int cnt = 1, sum = 0;
		for(int x : arr) {
			if(sum+x > capacity) {
				cnt++;
				sum=x;
			} else {
				sum+=x;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int answer = 0;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if(getCnt(arr, mid) <= m) {
				rt = mid-1;
				answer = mid;
			} else {
				lt = mid+1;
			}
			
			mid = (lt + rt) / 2;
		}

		System.out.println(answer);

	}
}