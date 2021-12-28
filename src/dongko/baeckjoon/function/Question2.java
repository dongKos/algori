package dongko.baeckjoon.function;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ���� �ѹ��� 1949�� �ε� ������ D.R. Kaprekar�� �̸� �ٿ���. ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ��������. ���� ���, d(75) = 75+7+5 = 87�̴�.

���� ���� n�� �־����� ��, �� ���� �����ؼ� n, d(n), d(d(n)), d(d(d(n))), ...�� ���� ���� ������ ���� �� �ִ�. 

���� ���, 33���� �����Ѵٸ� ���� ���� 33 + 3 + 3 = 39�̰�, �� ���� ���� 39 + 3 + 9 = 51, ���� ���� 51 + 5 + 1 = 57�̴�. �̷������� ������ ���� ������ ���� �� �ִ�.

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� �� ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�. 

�����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�. 100���� ���� ���� �ѹ��� �� 13���� �ִ�. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Question2 {

	public static void main(String [] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> list = new ArrayList<Integer>(10000);
		for(int i = 1; i <= 10000; i++) {
			int n = i;
			int d = d(n);
			list.add(d);
		}
		
		for(int i = 1; i <= 10000; i++) {
			if(!list.contains(i)) {
				System.out.println(i);
			}
		}
		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
		
		//linkedList ���ٴ� ArrayList��, 
		//ArrayList �ʱ�ȭ�� �迭 ���̸� �������ָ� 
		//������ ��������
	}
	
	static int d(int n) {
		int d = n;
		String nStr = n + "";
		for(int i = 0; i < nStr.length(); i ++) {
			d += Integer.parseInt(nStr.charAt(i) + "");
		}
		
		return d;
	}
}
