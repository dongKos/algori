package dongko.inflearn.dp_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @title 가장 높은 탑 쌓기
 * @author dongko
 * @date 2022. 3. 7.
 * @link https://cote.inflearn.com/contest/10/problem/10-04
 */
public class _4 {
	
	public static class Brick {
		int s;
		int height;
		int weight;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Brick> list = new ArrayList<> ();
		int [] dy = new int[n];
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			Brick b = new Brick();
			
			b.s = in.nextInt();
			b.height = in.nextInt();
			b.weight = in.nextInt();
			list.add(b);
		}
		
		list.sort(new Comparator<Brick>() {
			@Override
			public int compare(Brick o1, Brick o2) {
				return o2.s - o1.s;
			}
		});
		
		dy[0] = list.get(0).height;
		for(int i = 1; i < list.size(); i++) {
			int max = 0;
			
			for(int j = i-1; j >= 0; j--) {
				if(list.get(i).weight <= list.get(j).weight && dy[j] > max) {
					max = dy[j];
				}
			}
			dy[i] = max + list.get(i).height;
			answer = Math.max(answer, dy[i]);
		}
		System.out.println(answer);
	}
}
