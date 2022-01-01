package dongko.programmers.level1;

import java.util.Arrays;

/**
 * @title ����
 * @author dhkim
 * @date 2022. 1. 1.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class Budget {

	//������ ������ �߸� ���� �����ɸ�
	//������ ������ �� ����Ѵٰ� ��������
	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		System.out.println(solution(d, 9));
	}
	
	public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i = 0; i < d.length; i++) {
            budget = budget - d[i];
            if(budget < 0) break;
            answer++;
        }
        return answer;
    }
}
