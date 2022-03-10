package dongko.programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @title 뉴스클러스터링
 * @author dhkim
 * @date 2022. 3. 10.
 * @link https://programmers.co.kr/learn/courses/30/lessons/17677
 */
public class NewsClustering {
	class Solution {
		final int STATIC_NUM = 65536;

		public int solution(String str1, String str2) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			int answer = 0;
			ArrayList<String> list = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();

			for (int i = 0; i < str1.length() - 1; i++) {
				if (Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i + 1))) {
					list.add(str1.charAt(i) + "" + str1.charAt(i + 1));
				}
			}

			for (int i = 0; i < str2.length() - 1; i++) {
				if (Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i + 1))) {
					list2.add(str2.charAt(i) + "" + str2.charAt(i + 1));
				}
			}

			Collections.sort(list);
			Collections.sort(list2);

			ArrayList<String> union = new ArrayList<>(list);
			union.addAll(list2);
			int interCnt = 0;
			for (String str : list) {
				if (list2.remove(str)) {
					interCnt++;
					union.remove(str);
				}
			}
			if (interCnt == 0 && union.size() == 0)
				return STATIC_NUM;
			double d = (double) interCnt / union.size();
			return (int) (d * STATIC_NUM);
		}
	}
}
