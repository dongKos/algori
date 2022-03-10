package dongko.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title 가장 큰 수 
 * @author dhkim
 * @date 2022. 3. 10.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class BiggestNumber {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(s.solution(numbers));
		int[] numbers2 = {6, 10, 2};
		System.out.println(s.solution(numbers2));
	}
	static class Solution {
		public String solution(int[] arr) {
			String answer = "";
			String[] numbers = new String[arr.length];
			for (int i = 0; i < arr.length; i++)
				numbers[i] = arr[i]+"";
			Arrays.sort(numbers, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return (o2+o1).compareTo(o1+o2);
				}
			});
			for (String n : numbers)
				answer += n;
			if(answer.startsWith("0")) answer = "0";
			return answer;
		}
	}
}
