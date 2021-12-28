package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
 *�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. 
 *��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
 *�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String line = br.readLine();
			int a = Integer.parseInt(line.split(" ")[0]);
			int b = Integer.parseInt(line.split(" ")[1]);
			int v = Integer.parseInt(line.split(" ")[2]);
			
			int dayCnt = (v - a) / (a-b) + 1;
			if((v - a) % (a-b) != 0) {
				dayCnt ++;
			}
			System.out.println(dayCnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
