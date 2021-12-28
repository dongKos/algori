package dongko.programmers.level1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @title 3���� ������
 * @author dhkim
 * @date 2021. 12. 28.
 * @link https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Reverse3Ternary {

	//parseInt�� ���� ��ȯ ����� �ִ�..
	public static void main(String[] args) {
		
	}

	static class Solution {
		public long solution(int n) {
			//���� Ǯ��
			String str = "";
			while (n > 0) {
				str = str + (n % 3);
				n /= 3;
			}
			return Integer.parseInt(str, 3);
			
			//���� �� Ǯ��
//			Queue<Integer> q = new LinkedList<> ();
//
//	        int sn = n;
//	        while(true) {
//	            if(n < 3) {
//	                q.offer(n);
//	                break;
//	            }
//	            int r = 0;
//
//	            r = sn % 3;
//	            sn = sn / 3;
//	            q.offer(r);
//	            if(sn < 3) {
//	                q.offer(sn);
//	                break;
//	            };
//	        }
//	        String revNumStr = "";
//	        Iterator<Integer> iter = q.iterator(); 
//	        while(iter.hasNext()) 
//	            revNumStr += iter.next();
//
//	        long revNum = Long.parseLong(revNumStr);
//
//	        long answer = 0;
//	        int length = (revNum +"").length();
//	        for(int i = 0; i < length; i++) {
//	            answer += Integer.parseInt((revNum+"").charAt(i)+"") * Math.pow(3, length-i-1);
//	        }
//	        return answer;
		}
	}
}
