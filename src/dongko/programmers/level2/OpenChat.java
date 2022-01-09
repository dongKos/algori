package dongko.programmers.level2;

import java.util.*;

/**
 * @title ����ä�ù�
 * @author dhkim
 * @date 2022. 1. 9.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42888
 */
public class OpenChat {

	class Solution {
	    public ArrayList<String> solution(String[] record) {
	        ArrayList<String> answer = new ArrayList<> ();
	        HashMap<String, String> map = new HashMap<> ();
	        
	        for(String r : record) {
	            String [] rArr = r.split(" ");
	            
	            String act = rArr[0];
	            String uid = rArr[1];
	            String nick = (act.equals("Leave"))?"":rArr[2];
	            
	            if(map.get(uid) == null) {
	                map.put(uid, nick);
	            } else {
	                if(act.equals("Enter") || act.equals("Change")) {
	                    map.put(uid, nick);
	                } 
	            }
	        }
	        
	        for(String r : record) {
	            String act = r.split(" ")[0];
	            if(act.equals("Change")) continue;
	            String actStr = "";
	            String uid = r.split(" ")[1];
	            
	            if(act.equals("Enter")) actStr = "���Խ��ϴ�.";
	            else if(act.equals("Leave")) actStr = "�������ϴ�.";
	            answer.add(map.get(uid) + "���� " + actStr); 
	        }
	        return answer;
	    }
	}
}
