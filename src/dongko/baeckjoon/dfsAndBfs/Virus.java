package dongko.baeckjoon.dfsAndBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Virus {
	public static int [] v;
	public static int [][] e;
    public static boolean [] visited;
    public static int cnt = 0;
    public static int start = 1;
    
    public static void main(String [] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int C = Integer.parseInt(br.readLine());
            int E = Integer.parseInt(br.readLine());
            v = new int[C];
            visited = new boolean[C+1];
            visited[0] = true;
            e = new int [visited.length][visited.length];
            for(int i = 0; i < C; i++) {
                v[i] = i+1;
            }
            
            for(int i = 0; i < E; i++) {
                String [] s = br.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                
                e[x][y] = 1;
                e[y][x] = 1;
            }
            
            dfs(1);
            System.out.println(cnt);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void dfs(int num) {
    	visited[num] = true;
    	if(num != start) cnt++;
    	for(int i = 0; i < e[0].length; i++) {
    		int next = e[num][i];
    		if(next == 1 && !visited[i]) dfs(i);
    	}
    }

}
