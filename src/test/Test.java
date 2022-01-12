package test;

public class Test {

	int[] v = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	int[][] e = { 
				/*0*/{ 1 }, 
				/*1*/{ 0, 3}, 
				/*2*/{ 3 }, 
				/*3*/{ 1, 2 }, 
				/*4*/{ 6 },
				/*5*/{ 7, 8 },
				/*6*/{ 4 },
				/*7*/{ 5, 8 },
				/*8*/{ 5, 7 }
			};
//	int[][] e = { 
//			/*0*/{ 1, 2 }, 
//			/*1*/{ 0, 3, 5 }, 
//			/*2*/{ 0, 6, 8 }, 
//			/*3*/{1, 4 }, 
//			/*4*/{ 3, 5 },
//			/*5*/{1, 4},
//			/*6*/{ 2, 7, 8 },
//			/*7*/{ 6 },
//			/*8*/{ 2, 6 }
//	};
	boolean[] visited = new boolean[v.length];

	public static void main(String[] args) {
		Test t = new Test();
//		t.dfs(0);
		System.out.println(t.dfsAll());
	}

	public int dfsAll() {
		int c = 0;
		
		for(int i = 0; i < v.length; i++) {
			
			if(!visited[i]) {
				System.out.println("새로운 dfs 시작");
				dfs(i);
				c++;
			}
		}
		
		return c;
	}
	public void dfs(int curr) {
		visited[curr] = true;
		System.out.println(curr + " 방문함");
		for (int next : e[curr])
			if (!visited[next])
				dfs(next);

	}
}
