package dongko.programmers.level2;

import java.util.ArrayList;

/**
 * @title 기능개발
 * @author dongko
 * @date 2022. 1. 18.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class FeatureDevelopment {

	public static void main(String[] args) {
		int [] progresses = {96, 94};
		int [] speeds = {3, 3};
		new Solution().solution(progresses, speeds);
	}
	
	static class Solution {
		
		public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
			ArrayList<Integer> list = new ArrayList<> ();
			ArrayList<Integer> result = new ArrayList<> ();
			for(int i = 0; i < speeds.length; i++) {
				if((100 - progresses[i]) % speeds[i] != 0)
					list.add((int)Math.ceil((double)((100 - progresses[i]) / speeds[i]))+1);
				else
					list.add((int)Math.ceil((double)((100 - progresses[i]) / speeds[i])));
			}
			int m = list.get(0);
			int cnt = 1;
			for(int i = 1; i < list.size(); i++) {
				if(list.get(i) <= m)  {
					cnt++;
				} else {
					result.add(cnt);
					cnt = 1;
					m = list.get(i);
				}
			}
			result.add(cnt);
			return null;
		}
	}
}
