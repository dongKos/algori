package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String arr = br.readLine();
			
			if(arr.length() != n) return;
			int sum = 0;
			
			for(int i = 0; i < arr.length(); i++) {
				sum += Integer.parseInt(arr.charAt(i) + "");
			}
			System.out.println(sum);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
