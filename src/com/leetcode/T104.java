package com.leetcode;

/**
 * @author Enbing
 * @create 2021-09-22 8:56 PM
 * @Description
 */
public class T104 {
    public static class TreeNode {
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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int rightHeight = maxDepth(root.left);
            int leftHeight = maxDepth(root.right);
            return Math.max(rightHeight, leftHeight) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode();



    }
}

//
//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        int ans = 0;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            while (size > 0) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                size--;
//            }
//            ans++;
//        }
//        return ans;
//    }
//}
