package dongko.inflearn.string;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String [] result = new String [N];
		for(int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder(in.nextLine());
			result[i] = sb.reverse().toString();
		}
		for(String str : result)
			System.out.println(str);
	}
}
