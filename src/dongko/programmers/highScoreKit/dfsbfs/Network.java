package dongko.programmers.highScoreKit.dfsbfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title 네트워크
 * @author dhkim
 * @date 2022. 3. 8.
 * @link https://programmers.co.kr/learn/courses/30/lessons/43162 
 */
public class Network {
	class Solution {
	    int[] ch;
	    int answer = 0;
	    HashMap<Integer, HashSet<Integer>> map = new HashMap<> ();    
	    public int solution(int n, int[][] computers) {
	        ch = new int [n];
	        for(int i = 0; i < n; i++) 
	            map.put(i, new HashSet<> ());
	        
	        for(int i = 0; i < computers.length; i++) {
	            for(int j = 0; j < computers[i].length; j++) {
	                if(computers[i][j] == 1 && i != j) {
	                    map.get(i).add(j);
	                    map.get(j).add(i);
	                }
	            }
	        }
	        
	        for(int i = 0; i < n; i++) {
	            if(ch[i] == 0)
	                bfs(i);
	        }
	        return answer;
	    }
	    
	    public void bfs(int l) {
	        answer++;
	        Queue<Integer> q = new LinkedList<> ();
	        q.offer(l);
	        
	        while(!q.isEmpty()) {
	            int size = q.size();
	            
	            for(int i = 0; i < size; i++) {
	                int curr = q.poll();
	                ch[curr] = 1;
	                for(int node : map.get(curr)) {
	                    if(ch[node] == 0)
	                        q.offer(node);
	                }
	            }
	        }
	    }
	}
}
