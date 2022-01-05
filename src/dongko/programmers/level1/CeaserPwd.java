package dongko.programmers.level1;

/**
 * @title 시저암호
 * @author dhkim
 * @date 2022. 1. 5.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class CeaserPwd {

	class Solution {
	    public String solution(String s, int n) {
	        //대문자 65-90
	        //소문자 97-122
	        int [] a = new int [26];
	        int [] ca = new int[26];
	        
	        for(int i = 0; i < 26; i++) {
	            a[i] = i+65;
	            ca[i] = i+97;
	        }
	        
	        String answer = ""; 
	        for(int i = 0; i < s.length(); i++) {
	            int an = s.charAt(i);
	            int idx = 0;
	            char c = ' ';
	            if(an >= 65 && an <= 90) {
	                idx = an - 65;
	                c = (char) a[(idx+n)%26];
	            } else if(an >= 97 && an <= 122) {
	                idx = an - 97;
	                c = (char) ca[(idx+n)%26];
	            }
	            answer += c + "";
	        }
	        return answer;
	    }
	}
}
