package dongko.programmers.level2;

import java.util.*;

/**
 * @title «¡∏∞≈Õ
 * @author dhkim
 * @date 2022. 1. 10.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Printer {

	class Solution {
	    public int solution(int [] pri, int location) {
	        ArrayList<Integer> p = new ArrayList<> ();
	        for(int n : pri)
	            p.add(n);
	        int answer = 0;
	        LinkedList<Character> list = new LinkedList<> ();
	        HashMap<Character, Integer> map = new HashMap<>();
	        char c = 'A';
	        for(int i = 0; i < p.size(); i++) {
	            list.add(c);
	            map.put(c, p.get(i));
	            c++;
	        }
	        
	        Collections.sort(p);
	        String pOrder = "";
	        while(p.size() > 0) {
	            char doc = list.get(0);
	            int i = map.get(doc);
	            int cMax = p.get(p.size() - 1);
	            
	            if(i == cMax) {
	                pOrder += doc + "";
	                list.remove(0);
	                p.remove(p.size() - 1);
	            } else {
	                list.remove(0);
	                list.add(doc);
	            }
	        }
	        
	        for(int i = 0; i < pOrder.length(); i++) 
	            if(pOrder.charAt(i) == (char)('A'+location))
	                return i+1;
	        
	        return answer;
	    }
	}
}
