package dongko.programmers.highScoreKit.fullSearch;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @title 소수 찾기 
 * @author dongko
 * @date 2022. 3. 7.
 * @link https://programmers.co.kr/learn/courses/30/lessons/42839
 */
public class FindprimeNumber {
	class Solution {
	    
	    int n;
	    int [] ch;
	    ArrayList<Integer> p = new ArrayList<> ();
	    int [] arr;
	    Set<Integer> set = new TreeSet<>();
	    public int solution(String numbers) {
	        arr = new int[numbers.length()];
	        ch = new int[numbers.length()];
	        
	        n = numbers.length();
	        for(int i = 0; i < numbers.length(); i++) 
	            arr[i] = Integer.parseInt(numbers.charAt(i)+"");
	        
	        for(int i = 0; i < arr.length; i++) {
	            ch = new int[numbers.length()];
	            dfs(0, i, "");
	        }
	        int answer = countPrime();
	        return answer;
	    }
	    
	    public void dfs(int level, int max, String str) {
	        if(str.length() == max+1) {
	            set.add(Integer.parseInt(str));
	        } else {
	            for(int i = 0; i < arr.length; i++) {
	                if(ch[i] != 1) {
	                    str+=arr[i];
	                    ch[i] = 1;
	                    dfs(level+1, max, str);
	                    ch[i] = 0;
	                    str = str.substring(0, str.length()-1);
	                }
	            }
	        }
	        
	    }
	    
	    public int countPrime() {
	        int cnt = 0;
	        
	        for(int number : set) {
	            boolean isPrime = true;
	            if(number == 1 || number == 0) {
	                continue;
	            }
	            for(int j = 2; j < number; j ++) {
	                if(number % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if(isPrime == true) cnt++;
	        }
	        
	        return cnt;
	    }
	}
}
