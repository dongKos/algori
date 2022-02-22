package dongko.leetcode.string;

/**
 * @title Execution of All Suffix Instructions Staying in a Grid
 * @author dhkim
 * @date 2022. 2. 18.
 * @link https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/
 */
public class _2120 {
	class Solution {
	    public int[] executeInstructions(int n, int[] startPos, String s) {
	        int [] r = new int [s.length()];
	        int rt = 0;
	        int [] curPos = startPos;
	        while(rt < s.length()) {
	            int cnt = 0;
	            curPos = startPos;
	            for(int i = rt; i < s.length(); i++) {
	                String d = s.charAt(i) + "";
	                curPos = movePos(curPos, d);
	                if(0 <= curPos[0] && curPos[0] < n && 0 <= curPos[1] && curPos[1] < n) {
	                    cnt++;
	                } else {
	                    break;
	                }
	            }
	            r[rt] = cnt;
	            rt++;
	        }
	        return r;
	    }
	    
	    public int[] movePos(int [] currPos, String d) {
	        int [] result = new int [2];
	        int x = currPos[0], y = currPos[1];
	        
	        if(d.equals("U")) {
	            result[0] = x-1;
	            result[1] = y;
	        } else if(d.equals("R")) {
	            result[0] = x;
	            result[1] = y+1;
	        } else if(d.equals("D")) {
	            result[0] = x+1;
	            result[1] = y;
	        } else {
	            result[0] = x;
	            result[1] = y-1;
	        }
	        return result;
	    }
	}
}
