package dongko.programmers.level1;

import java.util.TreeSet;

/**
 * @title �� �� �̾Ƽ� ���ϱ�
 * @author dhkim
 * @date 2021. 12. 28.
 * @link https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */
public class AddTwo {
	public static void main(String[] args) {
		
	}
	//treeset �� add �ϸ鼭 ����
	class Solution {
	    public TreeSet<Integer> solution(int[] numbers) {
	        TreeSet<Integer> set = new TreeSet<Integer> ();
	        for(int i = 0; i < numbers.length; i++) {
	            for(int j = i+1; j < numbers.length; j++) {
	                set.add(numbers[i] + numbers[j]);
	            }
	        }
	        return set;
	    }
	}
}
