package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. ��Ʈ�� �Ǹ� ����� ������� 
 *�ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� ����� ���, 
 *�� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.
 *���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� �� 1,700������ ���.
 *��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. �Ϲ������� ���� ����� �÷� ���� ���� 
 *��� ���� �� ����(�Ǹź��)�� �� ���(=�������+�������)���� �������� �ȴ�. 
 *���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.
 *A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class Question {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int fixCst = Integer.parseInt(line.split(" ")[0]);
			int varCst = Integer.parseInt(line.split(" ")[1]);
			int cst = Integer.parseInt(line.split(" ")[2]);
			long result = 0;
			if(!(cst - varCst == 0))  {
				result = fixCst / (cst - varCst) + 1;
			}
			if(result <= 0) result = -1;
			System.out.println(result);
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
