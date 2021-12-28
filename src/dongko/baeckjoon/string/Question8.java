package dongko.baeckjoon.string;

import java.util.Scanner;

/*
	��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. 
	���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
	���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
	������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. 
	��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
	�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		int n = 0;
		int sum = 0;
		for(int i = 0; i < line.length(); i++) {
			int asci = line.charAt(i) + 0;
			if(asci >= 65 && asci <= 67) {
				n = 2;
			} else if(asci <= 70) {
				n = 3;
			} else if(asci <= 73) {
				n = 4;
			} else if(asci <= 76) {
				n = 5;
			} else if(asci <= 79) {
				n = 6;
			} else if(asci <= 83) {
				n = 7;
			} else if(asci <= 86) {
				n = 8;
			} else if(asci <= 90) {
				n = 9;
			}
			sum += (n + 1);
		}
		
		System.out.println(sum);
	}

}
