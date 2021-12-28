package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
	ù° �ٿ� �ִ� 100������ �ܾ �־�����. ���ĺ� �ҹ��ڿ� '-', '='�θ� �̷���� �ִ�.
	�ܾ�� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ�. ���� ������ ǥ�� �����ִ� ���ĺ��� ����� ���·� �Էµȴ�.
*/

public class Question9 {

	public static void main(String[] args) {
		//scanner�� �������� �ι谡 ������?!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//system.out�� bufferedwriter���� ������?!
		try {
			String line = br.readLine();
			Map<String, Integer> map = new HashMap<>();
			String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
			
			for (int c = 0; c < arr.length; c++) {
				String ca = arr[c];
				map.put(ca, 0);

				int idx = line.indexOf(ca);

				while (idx >= 0) {
					if (!(ca.equals("z=") 
							&& (idx != 0 && line.substring(idx - 1, idx).equals("d")))) {
						map.put(ca, map.get(ca) + 1);
					}

					idx = line.indexOf(ca, idx + 1);
				}
			}

			int cnt = line.length();
			for (String key : map.keySet()) {
				cnt -= key.length() * map.get(key);
				cnt += map.get(key);
			}
			
			System.out.println(cnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
