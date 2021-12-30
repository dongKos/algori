package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @title นๅมู
 * @author dhkim
 * @date 2021. 12. 30.
 * @link https://www.acmicpc.net/problem/2217
 */
public class Lope {

	public static void main (String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int n = Integer.parseInt(br.readLine());
            int [] lopes = new int[n];
            for(int i = 0; i < n; i++) {
                lopes[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(lopes);
            int max = 0;
            for(int i = 0; i < lopes.length; i++) {
            	if(max < lopes[i] * (lopes.length - i) ) max = lopes[i] * (lopes.length - i); 
            }
            System.out.println(max);
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
