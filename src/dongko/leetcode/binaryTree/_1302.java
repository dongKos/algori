package dongko.leetcode.binaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title Deepest Leaves Sum
 * @author dongko
 * @date 2022. 2. 20.
 * @link https://leetcode.com/problems/deepest-leaves-sum/
 */
public class _1302 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int deepestLeavesSum(TreeNode root) {
			Queue<TreeNode> q = new LinkedList<>();
			HashMap<Integer, Integer> sum = new HashMap<>();
			q.offer(root);
			int level = 0;
			int max = Integer.MIN_VALUE;
			while (!q.isEmpty()) {
				int size = q.size();
				sum.put(level, 0);
				for (int i = 0; i < size; i++) {
					TreeNode cur = q.poll();
					if (cur.left != null || cur.right != null) {
						if (cur.left != null) {
							sum.put(level, sum.get(level) + cur.left.val);
							q.offer(cur.left);
						}
						if (cur.right != null) {
							sum.put(level, sum.get(level) + cur.right.val);
							q.offer(cur.right);
						}
						if (max < level)
							max = level;
					}
				}
				level++;
			}
			return sum.get(max);
		}
	}
}
