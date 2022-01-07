package dongko.programmers.level2;

import java.util.HashMap;

/**
 * @title 전화번호 목록
 * @author dhkim
 * @date 2022. 1. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PhoneBook {
	class Solution {
	    public boolean solution(String[] phone_book) {
	        HashMap<String, Integer> map = new HashMap<>();
	        int idx = 0;
	        for(String p : phone_book) 
	            map.put(p,idx++);
	        for(int i = 0; i < phone_book.length; i++) {
	            for(int j = 0; j < phone_book[i].length(); j++) 
	                if(map.containsKey(phone_book[i].substring(0, j))) 
	                    return false;
	            
	        }
	        return true;
	    }
	}
}
