package dongko.programmers.level1;

/**
 * @title �ڸ��� ���ϱ�
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class DigitSum {

//	����ȯ�� �ƴ� %����� /�������� 
	public class Solution {
	    public int solution(int n) {
	        
	        int answer = 0;
	        while(n > 0) {
	            answer += n % 10;
	            n = n /10;
	        }
	        return answer;
	    }
	}
}
