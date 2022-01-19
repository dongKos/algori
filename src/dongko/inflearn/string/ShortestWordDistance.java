package dongko.inflearn.string;

import java.util.Scanner;

/**
 * @title 가장 짧은 문자거리
 * @date 2022. 1. 19.
 * @author ibank
 * @link https://cote.inflearn.com/contest/10/problem/01-10
 */
public class ShortestWordDistance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char target = in.next().charAt(0);
		char [] c = str.toCharArray();
		int [] result = new int [c.length];
		
		for(int i = 0; i < c.length; i++) {
			int lt = (i-1 < 0)?0:i-1, rt = (i+1 > c.length-1)?c.length-1:i+1;
			if(c[i] == target) {
				result[i] = 0;
			} else {
				
				while(lt >= 0 && rt <= c.length-1 ) {
					if(c[lt] == target) {
						result[i] = i - lt;
						break;
					} else if(c[rt] == target) {
						result[i] = rt - i;
						break;
					}
					
					if(lt > 0) lt--;
					if(rt < c.length -1) rt++;
				}
			}
			
		}
		String r = "";
		for(int num : result)
			r += num + " ";
		System.out.println(r.trim());
		return;
	}
}
