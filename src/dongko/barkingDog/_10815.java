package dongko.barkingDog;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @title 숫자 카드
 * @author dongko
 * @date 2022. 3. 5.
 * @link https://www.acmicpc.net/problem/10815
 */
public class _10815 {

	static int [] arr;
	static int [] arr2;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] line = in.nextLine().split(" ");
		int m = in.nextInt();
		in.nextLine();
		String[] line2 = in.nextLine().split(" ");
		
		arr = new int[n];
		arr2 = new int[m];
		
		for(int i = 0; i < Math.max(line.length, line2.length); i++) {
			if(i < line.length)
				arr[i] = Integer.parseInt(line[i]);
			if(i < line2.length)
				arr2[i] = Integer.parseInt(line2[i]);
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < line2.length; i++) {
			int lt = 0, rt = line.length-1, mid = (lt+rt)/2;
			while(lt < rt && lt >= 0 && rt < line.length) {
				
				if(arr[lt] == arr2[i] || arr[rt] == arr2[i]) { 
					arr2[i] = 1;
					break;
				}
				
				if(arr[mid] < arr2[i]) {
					lt = mid+1;
				} else if(arr[mid] > arr2[i]) {
					rt = mid;
				} else {
					arr2[i] = 1;
					break;
				}
				mid = (lt+rt)/2;
			}
		}
		
		for(int r : arr2) {
			if(r != 1) System.out.print(0 + " ");
			else System.out.print(r + " ");
		}
		
	}

}
