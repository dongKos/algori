package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/*
	���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
	S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
	QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
*/
public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int t = Integer.parseInt(br.readLine());
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < t; i++) {
				list.add(br.readLine());
			}
			
			for(String str : list) {
				int r = Integer.parseInt(str.split(" ")[0]);
				String s = str.split(" ")[1];
				
				for(int i = 0; i < s.length(); i++) {
					for(int j = 0; j < r; j++) {
						bw.write(s.charAt(i));
					}
				}
				bw.write("\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
