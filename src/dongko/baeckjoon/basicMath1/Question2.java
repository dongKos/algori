package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
 *�׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
 *���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� 
 *�� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *���� ���, 13������ 3��, 58������ 5���� ������. */
public class Question2 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			int point = 0;
			
			for(int i = 2; i <= n; i++) {
				if((i ==2) 
					|| i == (point + cnt * 6)) {
					cnt++;
					point = i;
				}
			}
			
			System.out.println(cnt + 1);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
