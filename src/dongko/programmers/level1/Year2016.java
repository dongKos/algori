package dongko.programmers.level1;

/**
 * @title 2016³â
 * @author dhkim
 * @date 2022. 1. 1.
 * @link https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Year2016 {
	public String solution(int a, int b) {
        String [] d = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int [] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int f = 5;
        int sum = 0;
        for(int i = 0; i < a-1; i++) {
            sum += m[i];
        }
        String answer = d[(f + sum + b-1) % d.length];
        return answer;
    }
}
