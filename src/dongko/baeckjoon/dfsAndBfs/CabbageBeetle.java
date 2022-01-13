package dongko.baeckjoon.dfsAndBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @title 유기농 배추
 * @author dongko
 * @date 2022. 1. 12.
 * @link https://www.acmicpc.net/problem/1012
 */
public class CabbageBeetle {
	
	//내 힘으로 처음으로 푼 dfs 문제 
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			//필요한 값들을 초기화
			int[][][] arr = {};
			ArrayList<Integer> cntList = new ArrayList<> ();
			HashMap<Integer, ArrayList<Integer>> vertexList = new HashMap<> ();
			int T = Integer.parseInt(br.readLine());
			arr = new int [T][][];
			for (int i = 0; i < T; i++) {
				String line = br.readLine();

				int w = Integer.parseInt(line.split(" ")[0]);
				int h = Integer.parseInt(line.split(" ")[1]);
				int c = Integer.parseInt(line.split(" ")[2]);
				cntList.add(c);
				int[][] bArr = new int[h][w];
				for (int j = 0; j < c; j++) {
					line = br.readLine();
					int wp = Integer.parseInt(line.split(" ")[0]);
					int hp = Integer.parseInt(line.split(" ")[1]);
					bArr[hp][wp] = 1;
					if(vertexList.get(i) == null) {
						ArrayList<Integer> vertex = new ArrayList<>();
						vertexList.put(i, vertex);
					}
					vertexList.get(i).add(hp * w + (wp));
				}
				
				arr[i] = bArr;
			}
			
			for(int i = 0; i < arr.length; i ++) {
				
				//간선을 담을 map
				HashMap<Integer, ArrayList<Integer>> e = new HashMap<> ();
				
				int cnt = 0;
				for (int h = 0; h < arr[i].length; h++) {
					for (int w = 0; w < arr[i][h].length; w++) {
						
						int top = 0, bottom = 0, left = 0, right = 0;
						ArrayList<Integer> tmpList = new ArrayList<> ();
						e.put(cnt, tmpList);
						
						//top
						if(h - 1 >= 0) {
							top = arr[i][h-1][w];
							if(top == 1) {
								ArrayList<Integer> list = new ArrayList<> ();
								list.add(h-1);
								list.add(w);
								e.get(cnt).add((h-1) * arr[i][h].length + (w));
							}
						}
						
						//bottom
						if(h + 1 <= arr[i].length - 1) {
							bottom = arr[i][h+1][w];
							if(bottom == 1) {
								ArrayList<Integer> list = new ArrayList<> ();
								list.add(h+1);
								list.add(w);
								e.get(cnt).add((h+1) * arr[i][h].length + (w));
							}
						}
						
						//left
						if(w != 0) {
							left = arr[i][h][w-1];
							if(left == 1) {
								ArrayList<Integer> list = new ArrayList<> ();
								list.add(h);
								list.add(w-1);
								e.get(cnt).add(h * arr[i][h].length + (w-1));
							}
						}
						
						//right
						if(w < arr[i][h].length - 1) {
							right = arr[i][h][w+1];
							if(right == 1) {
								ArrayList<Integer> list = new ArrayList<> ();
								list.add(h);
								list.add(w+1);
								e.get(cnt).add(h * arr[i][h].length + (w+1));
							}
						}
						cnt ++;
					}
				}
				//노드와 간선 생성 END
				Collections.sort(vertexList.get(i));
				
				boolean [] visited = new boolean[e.keySet().size()];
				dfs(vertexList.get(i).get(0), visited, e);
				System.out.println(dfsAll(vertexList.get(i), visited, e));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//간선이 이어져 있지 않은 노드들도 탐색하기 위해 만든 dfsAll
	static public int dfsAll(ArrayList<Integer> vertex, boolean [] visited, HashMap<Integer, ArrayList<Integer>> e) {
		int cnt = 1;
		
		for(int i = 0; i < vertex.size(); i++) {
			if(!visited[vertex.get(i)]) {
				cnt++;
				dfs(vertex.get(i), visited, e);
			}
		}
		
		return cnt;
	}
	
	
	static public void dfs(int node, boolean [] visited, HashMap<Integer, ArrayList<Integer>> e) {
		visited[node] = true;
		for(int next : e.get(node)) {
			if(!visited[next]) dfs(next, visited, e);
		}
			
	}
}
