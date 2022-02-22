package dongko.inflearn.RecursiveTreeGraph_07;

import java.util.Scanner;

/**
 * @title 부분집합 구하기 
 * @author dongko
 * @date 2022. 1. 28.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/72773
 */
public class Subset_06 {

	static int n;
	static int [] ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ch = new int [n+1];
		dfs(1);
	}
	private static void dfs(int l) {
		if(l == n+1) {
			String result = "";
			for(int i = 1; i < ch.length; i++) 
				if(ch[i] == 1) result += (i+" ");
			if(result.length() > 0)
				System.out.println(result);
		} else {
			//1. 부분집합에 l이 포함되는 경우
			ch[l] = 1;
			dfs(l+1);
			//2. 부분집합에 l이 포함되지 않는 경우
			ch[l] = 0;
			dfs(l+1);
		}
		
	}
}
