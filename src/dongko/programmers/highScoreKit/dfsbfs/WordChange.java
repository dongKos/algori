package dongko.programmers.highScoreKit.dfsbfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title 단어변환
 * @author dhkim
 * @date 2022. 3. 8.
 * @link https://programmers.co.kr/learn/courses/30/lessons/43163
 */
public class WordChange {

	class Solution {
	    HashMap<String, Boolean> map = new HashMap<> ();
	    int cnt = Integer.MAX_VALUE;
	    public int solution(String begin, String target, String[] words) {
	        for(String word : words)
	            map.put(word, false);
	        
	        bfs(begin, target, words);
	        return cnt;
	    }
	    
	    public void bfs(String begin, String target, String[] words) {
	        Queue<String> q = new LinkedList<> ();
	        q.offer(begin);
	        int level = 0;
	        boolean isEnable = false;
	        while(!q.isEmpty()) {
	            int size = q.size();
	            
	            for(int i = 0; i < size; i++) {
	                String curr = q.poll();
	                if(curr.equals(target)) {
	                    isEnable = true;
	                    cnt = Math.min(cnt, level);
	                    break;
	                }
	                map.put(curr, true);
	                for(int w = 0; w < words.length; w++) {
	                    String word = words[w];
	                    
	                    int diff = 0;
	                    for(int s = 0; s < word.length(); s++) {
	                        if(word.charAt(s) != curr.charAt(s)) diff++;
	                    }
	                    
	                    if(diff == 1 && map.get(word) == false) q.offer(word);
	                }
	            }
	            level++;
	        }
	        if(isEnable == false) cnt = 0;
	    }
	}
}
