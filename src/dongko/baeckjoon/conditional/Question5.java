package dongko.baeckjoon.conditional;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int rh = h;
		int rm = m;
		
		if(m - 45 < 0) {
			rm = 60 + (m - 45);
			rh = h -1;
			
			if(rh < 0) {
				rh = 23;
			}
		} else {
			rm = m - 45;
		}
		
		System.out.println(rh + " " + rm);
		
	}

}
