package dongko.barkingDog.backTracking;

import java.util.Scanner;

/**
 * @title n과 m 
 * @author dongko
 * @date 2022. 3. 5.
 * @link https://www.acmicpc.net/problem/15649
 */
public class _15649 {

	static int [] arr;
	static int [] result;
	static int [] ch;
	static int m;
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		ch = new int[n];
		arr = new int[n];
		result = new int[m];
		for(int i = 0; i < n; i++)
			arr[i] = i+1;
		
		dfs(0);
	}
	
	private static void dfs(int l) {
		if(l == m) {
			String rr = "";
			for(int num : result) {
				rr += num + " ";
			}
			if(rr.length() > 1) System.out.println(rr);
		} else {
			
			for(int i = 0; i < n; i++) {
				
				if(ch[i] != 1) {
					ch[i] = 1;
					result[l] = arr[i];
					dfs(l+1);
					ch[i] = 0;
				}
			}
		}
		
	}
}
