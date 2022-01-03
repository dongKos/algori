package dongko.programmers.level1;


/**
 * @title �������
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class SecretMap {

	//������� - ��Ʈ�������� ���� �ʿ�, 0,1�� �̷���� ���� �񱳿� | ������ ���
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
