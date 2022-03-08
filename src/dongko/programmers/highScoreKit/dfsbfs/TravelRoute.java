package dongko.programmers.highScoreKit.dfsbfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @title 여행경로
 * @author dhkim
 * @date 2022. 3. 8.
 * @link https://programmers.co.kr/learn/courses/30/lessons/43164#
 */
public class TravelRoute {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[][] tickets = { { "ICN", "AOO" }, { "AOO", "BOO" }, { "BOO", "COO" }, { "COO", "DOO" }, { "DOO", "EOO" },
				{ "EOO", "DOO" }, { "DOO", "COO" }, { "COO", "BOO" }, { "BOO", "AOO" } };
		
		String[][] tickets2 = 
				{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
		
		
		System.out.println(s.solution(tickets2));
	}

	static class Solution {
		boolean [] ch;
		List<String> answer = new ArrayList<>();
		public String[] solution(String[][] tickets) {
			ch = new boolean [tickets.length];
			dfs("ICN", "ICN", 0, tickets);
			Collections.sort(answer);
			String [] result = answer.get(0).split(" ");
			for(String a : result ) 
				System.out.print(a + " ");
			return result;
		}

		private void dfs(String start, String node, int count, String[][] tickets) {
			if(count == tickets.length) {
				answer.add(node);
			} else {
				
				for(int i = 0; i < tickets.length; i++) {
					
					if(ch[i] == false && tickets[i][0].equals(start)) {
						ch[i] = true;
						dfs(tickets[i][1], node+" " + tickets[i][1], count+1, tickets);
						ch[i] = false;
					}
				}
			}
		}

	}
}
