package dongko.baeckjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class Question3 {

	public static void main(String [] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(countHansu(n));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	static int countHansu(int n) {
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i < 10) {
				cnt++;
				continue;
			}
			
			String iStr = i + "";
			int d = Integer.parseInt(iStr.charAt(0) + "") - Integer.parseInt(iStr.charAt(1) + "");
			boolean isHansu = true;
			
			for(int j = 1; j < iStr.length(); j++) {
				if((Integer.parseInt(iStr.charAt(j-1) + "") 
						- Integer.parseInt(iStr.charAt(j) + "")) != d) {
					isHansu = false;
					break;
				}
			}
			
			if(isHansu) cnt ++;
		}
		
		return cnt;
	}
	
	
}
