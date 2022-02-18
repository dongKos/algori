package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String str = "https://leetcode.com/problems/design-tinyurl";
		System.out.println(str.hashCode());
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println((int)str.charAt(i));
		}
	}
}
