package dongko.inflearn.RecursiveTreeGraph_07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title 이진트리 레벨탐색
 * @author dongko
 * @date 2022. 1. 28.
 * @link https://www.inflearn.com/course/자바-알고리즘-문제풀이-코테대비/lecture/72768
 */
class Node {
	private int value;
	private Node lt;
	private Node rt;
	
	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLt() {
		return lt;
	}

	public void setLt(Node lt) {
		this.lt = lt;
	}

	public Node getRt() {
		return rt;
	}

	public void setRt(Node rt) {
		this.rt = rt;
	}
}
public class BinaryTreeLevelSearch_07 {
	
	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<> ();
		list.add(0, null);
		for(int i = 1; i <= 7; i++) 
			list.add(i, new Node(i));
		
		list.get(1).setLt(list.get(2));
		list.get(1).setRt(list.get(3));
		
		list.get(2).setLt(list.get(4));
		list.get(2).setRt(list.get(5));
		
		list.get(3).setLt(list.get(6));
		list.get(3).setRt(list.get(7));
		
		bfs(list.get(1));
	}

	private static void bfs(Node node) {
		Queue<Node> q = new LinkedList<> ();
		q.offer(node);
		int level = 1;
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				Node n = q.poll();
				if(n.getLt() != null) q.offer(n.getLt());
				if(n.getRt() != null) q.offer(n.getRt());
				System.out.println("level : " + level + " // " + n.getValue() + " 방문");
			}
			level++;
		}
	}
	
}
