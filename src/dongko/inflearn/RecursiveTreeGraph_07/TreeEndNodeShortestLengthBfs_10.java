package dongko.inflearn.RecursiveTreeGraph_07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title 트리 말단 노드까지의 가장 짧은 경로 BFS 
 * @author dongko
 * @date 2022. 1. 29.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/72772
 */
public class TreeEndNodeShortestLengthBfs_10 {

	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<> ();
		list.add(0, null);
		for(int i = 1; i <= 7; i++) 
			list.add(i, new Node(i));
		
		list.get(1).setLt(list.get(2));
		list.get(1).setRt(list.get(3));
		
		list.get(2).setLt(list.get(4));
		list.get(2).setRt(list.get(5));
		
		
		System.out.println(bfs(list.get(1)));
	}

	private static int bfs(Node node) {
		Queue<Node> q = new LinkedList<> ();
		q.offer(node);
		int level = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				Node curr = q.poll();
				if(curr.getLt() != null) q.offer(curr.getLt());
				if(curr.getRt() != null) q.offer(curr.getRt());
				
				if(curr.getLt() == null && curr.getRt() == null) 
					return level;
			}
			level++;
		}
		return level;
	}
}
