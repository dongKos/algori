package dongko.baeckjoon.conditional;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.println("<");
		} else if(a > b) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
		
	}

}
