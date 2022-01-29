package dongko.inflearn.RecursiveTreeGraph_07;

/**
 * @title 경로탐색(dfs)
 * @author dongko
 * @date 2022. 1. 29.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/72776
 */
public class RouteSearch_12 {

	static final int N = 5;
	static int [] [] e;
	static int [] v;
	static int cnt = 0;
	
	public static void main(String[] args) throws Exception {
		e = new int [N+1][N+1];
		v = new int [N+1];
		int [] checked = new int [N+1];
		e[1][2] = 1;
		e[2][1] = 1;
		e[1][3] = 1;
		e[1][4] = 1;
		e[2][3] = 1;
		e[3][4] = 1;
		e[4][2] = 1;
		e[2][5] = 1;
		e[4][5] = 1;
		checked[1] = 1;
		dfs(1, checked);
		System.out.println(cnt);
	}
	private static void dfs(int num, int [] checked) throws Exception {
		if(num == N) {
			cnt++;
		} else {
			
			//나랑 연결된 정점들 탐색
			for(int i = 0; i < e[num].length; i++) {
				//연결된 경우
				if(e[num][i] == 1 && checked[i] == 0) {
					checked[i] = 1;
					dfs(i, checked);
					checked[i] = 0;
				}
			}
		}
		
	}
}
