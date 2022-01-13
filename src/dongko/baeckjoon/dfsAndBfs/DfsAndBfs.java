package dongko.baeckjoon.dfsAndBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DfsAndBfs {
	static class Graph {
		public int[] v;
		public ArrayList<ArrayList<Integer>> e = new ArrayList<> ();
		public boolean[] visited;
		public String dfsResult = "";

		public Graph(int num) {
            v = new int[num];
            for(int i = 0; i < num; i++) {
                v[i] = i;
                e.add(new ArrayList<Integer>());
            }
            visited = new boolean[num];
        }

		public void addEdge(int x, int y) {
            if(!e.get(x).contains(y)) e.get(x).add(y);
            if(!e.get(y).contains(x)) e.get(y).add(x);
            Collections.sort(e.get(x));
            Collections.sort(e.get(y));
        }

		public void dfsR(int num) {
			visited[num] = true;
			dfsResult += (num+1) + " ";
			for(int next : e.get(num))
				if(!visited[next]) dfsR(next);
		}
		
		public String bfs(int num) {
			String result = "";
			Queue<Integer> q = new LinkedList<> ();
			
			q.offer(num);
			visited[num] = true;
			
			while(!q.isEmpty()) {
				int curr = q.poll();
				result += (curr+1) + " ";
				for(int next : e.get(curr)) {
					if(!visited[next]) {
						visited[next] = true;
						q.offer(next);
					}
				}
			}
			return result;
		}

		public void cleanVisit() {
			visited = new boolean[v.length];
		}
		
		public void print() {
			for(int num : v)
				System.out.println(num);
			
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] s = br.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int V = Integer.parseInt(s[2])-1;

			Graph g = new Graph(N);

			for (int i = 0; i < M; i++) {
				String[] ss = br.readLine().split(" ");
				g.addEdge(Integer.parseInt(ss[0])-1, Integer.parseInt(ss[1])-1);
			}
			g.dfsR(V);
			System.out.println(g.dfsResult);
			g.cleanVisit();
			System.out.println(g.bfs(V));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
