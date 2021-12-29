package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


/**
 * @title ATM
 * @author dhkim
 * @date 2021. 12. 29.
 * @link https://www.acmicpc.net/problem/11399
 */
public class Atm {
	public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int n = Integer.parseInt(br.readLine());
            String [] pStr = br.readLine().split(" ");
            int [] p = new int [pStr.length];
            int size = 0;
            for(String t : pStr) {
                p[size++] = Integer.parseInt(t);
            }
            Arrays.sort(p);
            
            int sum = 0;
            for(int i = 0; i < p.length; i++) {
                
                for(int j = 0; j <= i; j++) {
                    sum += p[j];
                }
            }
            bw.write(sum + "\n");
            bw.flush();
			bw.close();
			br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
