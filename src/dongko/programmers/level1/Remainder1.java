package dongko.programmers.level1;

/**
 * @title �������� 1�� �Ǵ� �� ã��
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/87389
 */
public class Remainder1 {

	class Solution {
	    public int solution(int n) {
	        
	        int i = 0;
	        while(i < n) {
	            if(n % ++i == 1) return i;
	        }
	        return i;
	    }
	}
}
