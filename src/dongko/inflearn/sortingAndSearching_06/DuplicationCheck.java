package dongko.inflearn.sortingAndSearching_06;

import java.util.Scanner;

/**
 * @title 중복 확인
 * @author dongko
 * @date 2022. 1. 24.
 * @link https://cote.inflearn.com/contest/10/problem/06-05
 */
public class DuplicationCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		
		for(int i = 0; i < arr.length; i++) 
			for(int j = 0; j < arr.length - i - 1; j++) 
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
		
		String result = "U";
		for(int i = 0; i < arr.length-1; i++)
			if(arr[i] == arr[i+1]) {
				result = "D";
				break;
			}
		System.out.println(result);
		
		return;
	}
}
