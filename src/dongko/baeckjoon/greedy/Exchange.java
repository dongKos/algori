package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @title °Å½º¸§µ·
 * @author dhkim
 * @date 2021. 12. 30.
 * @link https://www.acmicpc.net/problem/5585
 */
public class Exchange {

	public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int exc = 1000 -Integer.parseInt(br.readLine());
            int [] coins = {500, 100, 50, 10, 5, 1};
            
            int cnt = 0;
            for( int i = 0; i < coins.length; i++ ) {
                cnt += exc / coins[i];
                exc = exc % coins[i];
            }
            System.out.println(cnt);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
