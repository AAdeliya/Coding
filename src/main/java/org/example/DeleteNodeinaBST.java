package org.example;

import javax.swing.tree.TreeNode;

public class DeleteNodeinaBST {
    public TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) { return null;
    }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode min = root.right;
                while (min.left != null) {
                    min = min.left;
                }

                root.val = min.val;
                root.right =  deleteNode(root.right, min.val);
                return root;
            }
        }
}
