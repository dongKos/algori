package dongko.baeckjoon.inflearnRecommend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @title 암호 만들기
 * @author dhkim
 * @date 2022. 3. 14.
 * @link https://www.acmicpc.net/problem/1759
 */
public class _1759 {

	static int[] ch;
	static String[] p;
	static String[] arr;
	static int l;
	static int c;
	static HashSet<String> set = new HashSet<> ();
	static ArrayList<String> list;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String temp[] = br.readLine().split(" ");
			l = Integer.parseInt(temp[0]);
			c = Integer.parseInt(temp[1]);
			ch = new int[c];
			p = new String[l];
			arr = br.readLine().split(" ");
			Arrays.sort(arr);
			dfs(0, 0);
			list = new ArrayList<>(set);
			Collections.sort(list);
			for(String str : list)
				System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void dfs(int cnt, int idx) {
		if(cnt == l) {
			String result = "";
			for(int i = 0; i < p.length; i++) {
				result += p[i];
			}
			char[] tempCh = result.toCharArray();
			Arrays.sort(tempCh);
			result = "";
			for(char ch : tempCh)
				result += ch+"";
			if(validate(result) == true) set.add(result);
		} else {
			for(int i = idx; i < arr.length; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[cnt] = arr[i];
					dfs(cnt+1, i+1);
					ch[i] = 0;
				}
			}
		}
	}
	private static boolean validate(String result) {
		boolean validate = false;
		int vCnt = 0, conCnt = 0;
		for(int i = 0; i < result.length(); i++) {
			String str = result.charAt(i)+"";
			if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
				vCnt++;
			} else 
				conCnt++;
		}
		if(vCnt >= 1 && conCnt >= 2) validate = true;
		return validate;
	}
}
