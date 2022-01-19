package dongko.inflearn.arrays;

import java.util.Scanner;

/**
 * @title 가위바위보 
 * @author dongko
 * @date 2022. 1. 19.
 * @link https://cote.inflearn.com/contest/10/problem/02-03
 */
public class RSP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String [] s1 = in.nextLine().split(" ");
		String [] s2 = in.nextLine().split(" ");
		for(int i = 0; i < s1.length; i++) {
			int a = Integer.parseInt(s1[i]);
			int b = Integer.parseInt(s2[i]);
			String result = "";
			if(a == 1 && b == 3) result = "A";
			else if(a == 2 && b == 1) result = "A";
			else if(a == 3 && b == 2) result = "A";
			
			if(b == 1 && a == 3) result = "B";
			else if(b == 2 && a == 1) result = "B";
			else if(b == 3 && a == 2) result = "B";
			
			if(a == b) result = "D";
			System.out.println(result);
		}
		return;
	}
}
