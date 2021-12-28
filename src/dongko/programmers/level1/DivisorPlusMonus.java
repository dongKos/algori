package dongko.programmers.level1;

/**
 * @title 약수의 개수와 덧셈
 * @author dhkim
 * @date 2021. 12. 28.
 * @link https://programmers.co.kr/learn/courses/30/lessons/77884
 */
public class DivisorPlusMonus {

	//제곱수는 약수의 개수가 짝수, 아니면 홀수
	public static void main(String[] args) {
		
	}
	
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        for(int i = left; i <=right; i++) {
	            int cnt = getCnt(i);
	            
	            if(cnt % 2 == 0) answer = answer + i;
	            else answer = answer - i;
	        }
	        
	        return answer;
	    }
	    
	    public int getCnt(int num) {
	        int cnt = 1;
	        for(int i = 2; i <= num; i++) {
	            if(num % i == 0) cnt ++;
	        }
	        return cnt;
	    }
	}
}
