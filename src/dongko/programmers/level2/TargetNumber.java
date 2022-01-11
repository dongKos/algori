package dongko.programmers.level2;

import java.util.ArrayList;

/**
 * @title 타겟넘버
 * @author user
 * @date 2022. 1. 11.
 * @link https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class TargetNumber {

	//이진트리 생성해서 리프노드 뒤지는 방법으로 해결
	class Solution {
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        ArrayList<Integer> list = new ArrayList<> ();
	        list.add(0);
	        for(int i = 1; i <= numbers.length; i++) {
	            
	            int num = numbers[i-1];
	            int num2 = -1*numbers[i-1];
	            
	            for(int j = 0; j < Math.pow(2, i); j++) {
	                int parent = list.get((list.size()-1)/2);
	                
	                int val = parent + num;
	                
	                if(list.size() % 2 == 0 )
	                    val = parent + num2;
	                
	                list.add(val);
	                if(i == numbers.length && val == target) answer++;
	            }
	        }
	        return answer;
	    }
	}
}
