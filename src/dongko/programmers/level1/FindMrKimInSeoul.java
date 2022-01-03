package dongko.programmers.level1;

/**
 * @title 서울에서 김서방 찾기
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
	        return "김서방은 " + idx + "에 있다";
	    }
	}
}
