package dongko.baeckjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
 
 �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Question5 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			double N = parse(br.readLine());
			
			String [] arr = br.readLine().split(" ");
			double [] nArr = new double [(int) N];
			
			double max = parse(arr[0]);
			for(String score : arr) {
				if(parse(score) > max) max = parse(score);
			}
			
			
			double sum = 0;
			for(int i = 0; i < N; i++) {
				nArr[i] = (double)parse(arr[i]) / max * 100;
				sum += nArr[i];
			}
			
			System.out.println(sum / N);
			
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static double parse(String str) {
		return Double.parseDouble(str);
	}

}
