package dongko.baeckjoon.dfsAndBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ApartNumber {
	public static int[][] aparts;
	public static LinkedHashMap<Integer, ArrayList<Integer>> edge = new LinkedHashMap<>();
	public static int[] v;
	public static int n = 0;
	public static int[] X = { -1, 1, 0, 0 };
	public static int[] Y = { 0, 0, -1, 1 };
	public static boolean [] visited;

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(br.readLine());
			n = N;
			aparts = new int[N][N];
			int vCnt = 0;
			visited = new boolean[N*N];
			
			// 아파트 배열 생성
			for (int i = 0; i < N; i++) {
				String[] a = br.readLine().split("");
				for (int j = 0; j < a.length; j++) {
					int val = Integer.parseInt(a[j]);
					aparts[i][j] = val;
					// 아파트가 있으면 간선배열 초기화
					if (val == 1) {
						vCnt++;
						edge.put(i * N + j, new ArrayList<Integer>());
					}
				}
			}
			// 아파트 수 만큼 노드 배열 생성
			v = new int[vCnt];
			vCnt = 0;
			// 각 노드를 돌면서 값이 1이면 인접노드 검사해서 edge에 채워넣음
			for (int i = 0; i < aparts.length; i++) {
				for (int j = 0; j < aparts[i].length; j++) {
					int apt = aparts[i][j];
					if (apt == 1) {
						// 인덱스 = 세로 * N + 가로
						v[vCnt++] = i * N + j;
						// 현재 좌표로 상하좌우 보고 간선 배열에 삽입
						findLinked(i, j);
					}
				}
			}
			ArrayList<Integer> result = bfsAll();
			Collections.sort(result);
			System.out.println(result.size());
			for(int count : result)
				System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dfs(int i) {
		visited[i] = true;
		for(int next : edge.get(i)) {
			if(!visited[next]) dfs(next);
		}
	}
	
	public static int bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		int cnt = 0;
		while(!q.isEmpty()) {
			int curr = q.poll();
			visited[curr] = true;
			cnt++;
			for(int next : edge.get(curr)) {
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
				}
			}
		}
		return cnt;
	}
	
	public static void dfsAll() {
		for(int i = 0; i < n*n; i++) {
			if(edge.get(i) != null && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static ArrayList<Integer> bfsAll() {
		ArrayList<Integer> result = new ArrayList<> ();
		for(int i = 0; i < n*n; i++) {
			if(edge.get(i) != null && !visited[i]) {
				result.add(bfs(i));
			}
		}
		return result;
	}

	private static void findLinked(int x, int y) {
		int currAptIdx = x * n + y;

		for (int i = 0; i < X.length; i++) {
			// 상하좌우 값이 좌표 범위 안에 있고 (0 ~ n),
			// 그 좌표에 아파트가 존재하면 간선배열에 삽입
			if (((x + X[i]) >= 0 && (x + X[i]) <= n-1) && ((y + Y[i]) >= 0 && (y + Y[i]) <= n-1)) {
				if (aparts[x + X[i]][y + Y[i]] == 1) {
					int linkedAptIdx = (x + X[i]) * n + (y + Y[i]);
					edge.get(currAptIdx).add(linkedAptIdx);
				}

			}
		}
	}
}
