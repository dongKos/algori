package dongko.leetcode.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @title Sum of Nodes with Even-Valued Grandparent
 * @author dongko
 * @date 2022. 2. 20.
 * @link https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 */
public class _1315 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode parent;

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
		public int sumEvenGrandparent(TreeNode root) {
			Queue<TreeNode> q = new LinkedList<>();
			q.offer(root);
			int answer = 0;
			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < size; i++) {
					TreeNode cur = q.poll();

					if (cur.parent != null && cur.parent.parent != null && cur.parent.parent.val % 2 == 0) {
						answer += cur.val;
					}

					if (cur.left != null) {
						TreeNode child = cur.left;
						child.parent = cur;
						q.offer(child);
					}

					if (cur.right != null) {
						TreeNode child = cur.right;
						child.parent = cur;
						q.offer(child);
					}
				}
			}
			return answer;
		}
	}
}
