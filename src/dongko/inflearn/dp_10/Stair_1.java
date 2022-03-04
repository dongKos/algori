package dongko.inflearn.dp_10;

import java.util.Scanner;

/**
 * @title 계단오르기 
 * @author dongko
 * @date 2022. 3. 4.
 * @link https://cote.inflearn.com/contest/10/problem/10-01
 */
public class Stair_1 {

	static int [] dy;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		dy = new int[n];
		dy[0] = 1;
		dy[1] = 2;
		for(int i = 2; i < n; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		System.out.println(dy[n-1]);
		return;
	}
}
