package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title 뮤직비디오(결정 알고리즘)
 * @date 2022. 1. 27.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/06-09
 */
public class MusicVideo_09 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int [] arr = new int [n];
		int rt = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			rt+=arr[i];
		}
		int lt = arr[arr.length-1];
		int mid = (lt + rt) / 2;
		int answer = 0;
		while(lt <= rt) {
			int sum = 0;
			int cnt = 1;
			for(int i = 0; i < arr.length; i++) {
				sum+=arr[i];
				if(sum >= mid) {
					sum = 0;
					cnt++;
				}
			}
			if(cnt <= m) {
				rt = mid-1;
			} else {
				lt = mid+1;
			}
			answer = mid;
			System.out.println("cnt : " + cnt + " answer : " + answer);
			mid = (lt + rt) / 2;
			Thread.sleep(1000);
		}
		
		System.out.println(answer);
		
	}
}
