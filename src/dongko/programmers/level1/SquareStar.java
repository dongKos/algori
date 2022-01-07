package dongko.programmers.level1;

import java.util.Scanner;

/**
 * @title 직사각형 별찍기
 * @author dhkim
 * @date 2022. 1. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class SquareStar {

	static class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	    
	        for(int row = 0; row < b; row ++) {
	            
	            for(int col = 0; col < a; col ++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	    }
	}

}
