package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
	���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
	������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
	���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Question3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			Map<Integer, Integer> map = new HashMap<> ();
			for(int i = 0; i < s.length(); i++) {
				int a = s.charAt(i) + 0;
				
				if(a >= 97 && a <= 122) {
					if(map.get(a) == null)
						map.put(a, i);
				}
			}
			
			for(int i = 97; i <= 122; i++) {
				if(map.get(i) != null) {
					System.out.print(map.get(i) + " ");
				} else {
					System.out.print(-1 + " ");
				}
			}
			
		
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
