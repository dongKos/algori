package dongko.baeckjoon.string;

import java.util.Scanner;

/*
	������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
	�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
	����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
	����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, 
	����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextInt() + "";
		String b = sc.nextInt() + "";

		String revA = "", revB = "";
		for (int i = a.length()-1; i >= 0; i--) {
			revA += a.charAt(i);
		}
		
		for (int i = b.length()-1; i >= 0; i--) {
			revB += b.charAt(i);
		}
		
		int result = (Integer.parseInt(revA) > Integer.parseInt(revB))
				?Integer.parseInt(revA)
				:Integer.parseInt(revB); 
		System.out.println(result);
	}

}
