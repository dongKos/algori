package dongko.programmers.level1;


/**
 * @title 비밀지도
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class SecretMap {

	//비밀지도 - 비트연산자의 이해 필요, 0,1로 이루어진 숫자 비교에 | 연산자 사용
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        
	        String [] result = new String [n];
	        for(int i = 0; i < arr1.length; i++) {
	            String pwdStr = Integer.toBinaryString(arr1[i] | arr2[i]);
	            while(pwdStr.length() < n) {
	                pwdStr = "0" + pwdStr;
	            }
	            result[i] = pwdStr.replaceAll("1", "#").replaceAll("0", " ");
	        }
	        return result;
	    }
	}
}
