package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 
 ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 
 ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question6 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int N = parse(br.readLine());
			List<String> list = new ArrayList<>();
			int cnt = 0;
			while(cnt < N) {
				cnt ++;
				list.add(br.readLine());
			}
			
			for(String str : list) {
				int count = 0;
				int sum = 0;
				
				for(int i = 0; i < str.length(); i++) {
					String ox = str.charAt(i) + "";
					if(ox.equals("O")) {
						count++;
					} else {
						count = 0;
					}
					
					sum += count;
				}
				
				bw.write(sum + "\n");
			}

			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

}
