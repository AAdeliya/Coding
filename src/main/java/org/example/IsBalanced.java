package org.example;

import javax.swing.tree.TreeNode;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;

    }

    private void dfsHeight(TreeNode root) {
        if (node == null) return 0; //base case
        int leftHeight = dfsHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
