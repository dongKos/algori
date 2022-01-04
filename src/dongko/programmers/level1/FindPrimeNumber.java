package dongko.programmers.level1;

/**
 * @title 소수 찾기
 * @author dhkim
 * @date 2022. 1. 4.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class FindPrimeNumber {
	
	//에라토스테네스의 체
	public static void main(String[] args) {
		
	}

	public static int solution(int n) {
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			for(int j = 2; i * j <= n; j++) {
				arr[i*j -1] = 0;
			}
		}
		
		int cnt = 0;
		for(int i = 1; i < n; i ++) {
			if(arr[i] != 0) cnt++;
		}
		
		return cnt;
    }
}
