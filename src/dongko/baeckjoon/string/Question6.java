package dongko.baeckjoon.string;

import java.util.Scanner;
/*
	���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. 
	�� ���ڿ����� �� ���� �ܾ ������? 
	�̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
*/
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        sc.close();
         
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
	}

}
