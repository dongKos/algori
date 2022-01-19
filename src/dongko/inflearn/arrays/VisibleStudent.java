package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 보이는 학생
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-02
 */
public class VisibleStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String [] s = in.nextLine().split(" ");
		int [] a = new int [s.length];
		for(int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		
		int max = a[0];
		int cnt = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				cnt++;
			}
			
		}
		System.out.println(cnt);
		return;
	}
}
