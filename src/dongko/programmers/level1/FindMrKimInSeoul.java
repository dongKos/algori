package dongko.programmers.level1;

/**
 * @title ���￡�� �輭�� ã��
 * @author dhkim
 * @date 2022. 1. 3.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class FindMrKimInSeoul {

	class Solution {
	    public String solution(String[] seoul) {
	        
	        int idx = 0;
	        for(int i = 0; i < seoul.length; i++) {
	            if(seoul[i].equals("Kim")) {
	                idx = i;
	                break;
	            }
	        }
	        return "�輭���� " + idx + "�� �ִ�";
	    }
	}
}
