package dongko.leetcode.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @title Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * @author dongko
 * @date 2022. 2. 20.
 * @link https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class _1379 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
			Queue<TreeNode> q = new LinkedList<>();
			q.offer(cloned);
			TreeNode answer = null;
			while (!q.isEmpty()) {
				TreeNode cur = q.poll();
				if (cur.val == target.val) {
					answer = cur;
					break;
				}
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			return answer;
		}
	}
}
