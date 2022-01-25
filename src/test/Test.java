package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] h = new int[n];
		for(int i = 0; i < n; i++)
			h[i] = in.nextInt();
		
		int c = 0;
		int m = 0;
		for(int i = h.length-1; i > 0; i--) 
			if(h[i-1] > h[i]) {
				c = i+1;
				break;
			}
		
		for(int i = 0; i < h.length-1; i++) 
			if(h[i] > h[c-1]) {
				m = i+1;
				break;
			}
			
		System.out.println(m + " " + c);
		return;
	}
}
