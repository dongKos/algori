package dongko.baeckjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
	�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
	���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, 
	aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
	�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

public class Question10 {

	public static void main(String[] args) {
		//scanner�� �������� �ι谡 ������?!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int i = 0; i < n; i++) {
				String line = br.readLine();
				Map<String, ArrayList<Integer>> map = new HashMap<>();
				
				//�Է¹��� ���ڿ� ��ȸ
				for(int c = 0; c < line.length(); c++) {
					
					//�� ���ĺ� ���� ��ġ�� �ε����� ���� �迭�� map�� �ִ´�
					// aabbcc : {{a : [0, 1]}. {b : [2, 3]}, {c : [4,5]}}
					if(map.get(line.charAt(c) + "") == null) {
						ArrayList<Integer> tmpList = new ArrayList<>();
						map.put(line.charAt(c) + "", tmpList);
					}
					
					map.get(line.charAt(c) + "").add(c);
				}
				
				boolean isGrpNum = true;
				//���� �ϳ����� �˻�
				for(String key : map.keySet()) {
					ArrayList<Integer> idxList = map.get(key);
					
					//�迭 ���̰� 1�̸� �˻� ���ʿ�
					if(idxList.size() > 1) {
						
						//�� �ε����� �� �� �ε����� �� => 1���� ����
						for(int idx = 1; idx < idxList.size(); idx++) {
							
							//���� ���̰� 1���� ũ�ٸ�? => ���� �������ִٴ� �� 
							//ex) (aba) => a : [0, 2]
							if(idxList.get(idx) - idxList.get(idx - 1) > 1) {
								isGrpNum = false;
								//�ϳ��� �������������� �� ���ʿ� ����
								break;
							}
						}
						
					} 
					
				}
				
				//���Ⱑ cnt++ ����
				if(isGrpNum) cnt++;
			}
			System.out.println(cnt);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
