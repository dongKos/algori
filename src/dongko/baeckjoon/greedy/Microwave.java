package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @title 전자레인지
 * @author dhkim
 * @date 2021. 12. 30.
 * @link https://www.acmicpc.net/problem/10162
 */
public class Microwave {

	public static void main (String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int t = Integer.parseInt(br.readLine());
            
            int [] bArr = {300, 60, 10};
            int [] cntArr = new int [3];
            for(int i = 0; i < bArr.length; i++) {
                cntArr[i] = t / bArr[i];
                t = t % bArr[i];
            }
            
            if(t != 0) {
                System.out.println(-1);    
            } else {
                for(int cnt : cntArr) {
                    System.out.print(cnt + " ");
                }
            }
            
        } catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
