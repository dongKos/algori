package dongko.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @title 메뉴 리뉴얼
 * @author dhkim
 * @date 2022. 3. 10.
 * @link https://programmers.co.kr/learn/courses/30/lessons/72411
 */
public class MenuRenewal {

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] orders = { "XYZ", "XWY", "WXA" };
		int[] course = { 2, 3, 4 };
		System.out.println(s.solution(orders, course));
	}

	static class Solution {
		HashMap<Integer, HashMap<String, Integer>> map = new HashMap<>();
		HashMap<Integer, Integer> maxMap = new HashMap<>();
		int[] ch;

		public ArrayList<String> solution(String[] orders, int[] course) {
			ArrayList<String> answer = new ArrayList<>();

			for (int i = 0; i < course.length; i++) {
				map.put(course[i], new HashMap<String, Integer>());
				maxMap.put(course[i], Integer.MIN_VALUE);
			}

			for (int i = 0; i < orders.length; i++) {
				ch = new int[orders[i].length()];
				dfs(0, orders[i]);
			}

			for (int c : maxMap.keySet()) {
				if (maxMap.get(c) >= 2) {

					for (String menu : map.get(c).keySet()) {
						if (map.get(c).get(menu) == maxMap.get(c))
							answer.add(menu);
					}
				}
			}
			Collections.sort(answer);
			return answer;
		}

		public void dfs(int depth, String orders) {
			if (depth == orders.length()) {
				String result = "";
				for (int i = 0; i < ch.length; i++)
					if (ch[i] == 1)
						result += orders.charAt(i) + "";
				char[] temp = result.toCharArray();
				Arrays.sort(temp);
				result = new String(temp);
				int c = result.length();
				if (c > 0 && map.get(c) != null) {

					if (map.get(c).get(result) == null) {
						map.get(c).put(result, 0);
					}
					map.get(c).put(result, map.get(c).get(result) + 1);

					if (maxMap.get(c) < map.get(c).get(result))
						maxMap.put(c, map.get(c).get(result));
				}
			} else {
				ch[depth] = 1;
				dfs(depth + 1, orders);
				ch[depth] = 0;
				dfs(depth + 1, orders);
			}
		}
	}
}
