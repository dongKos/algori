package dongko.programmers.highScoreKit.heap;

import java.util.PriorityQueue;

/**
 * @title �� �ʰ�
 * @author dhkim
 * @date 2022. 1. 8.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42626
 */
public class Spicier {
	//�켱����ť�� �޼ҵ� ������ ������ ��.	
	class Solution {
	    public int solution(int[] scoville, int K) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<> ();
	        for(int num : scoville) 
	            minHeap.add(num);
	        
	        int cnt = 0;
	        while(true) {
	            cnt ++;
	            if(minHeap.isEmpty() || minHeap.size() == 1) {
	                cnt = -1;
	                break;
	            }
	            int min = minHeap.poll();
	            int min2 = minHeap.poll();
	            int mixed = min + (min2 * 2);
	            minHeap.add(mixed);
	            
	            int last = minHeap.peek();
	            if(last >= K) break;
	        }
	        return cnt;
	    }
	}
}
