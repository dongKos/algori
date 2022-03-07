package dongko.inflearn.dp_10;

import java.util.Scanner;

/**
 * @title 돌다리 건너기
 * @author dongko
 * @date 2022. 3. 7.
 * @link https://cote.inflearn.com/contest/10/problem/10-02
 */
public class _2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr = new int [n+1];
		
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[n]);
		return;
	}
}
