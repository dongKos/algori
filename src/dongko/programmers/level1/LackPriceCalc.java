package dongko.programmers.level1;


/**
 * @title ������ �ݾ� ����ϱ�
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/82612
 */
public class LackPriceCalc {

	//int������ ����� ��� Ʋ��
	class Solution {
	    public long solution(int price, int money, int count) {
	        long cnt = 0;
	        long cost = 0;
	        long answer = 0;
	        while(cnt != count) {
	            cost += price * ++cnt;
	        }
	        if(cost > money) answer = cost - money;
	        return answer;
	    }
	}
}
