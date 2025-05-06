package org.example;

import javax.swing.tree.TreeNode;

public class IsSameTree {
    public boolean isSameTree(TreeNode q, TreeNode p) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
