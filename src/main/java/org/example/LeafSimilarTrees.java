package org.example;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = traverse(root1, new ArrayList<>());
        List<Integer> list2 = traverse(root2, new ArrayList<>());

        if (list1.size() != list2.size()) return false;

        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) return false;
        }

        return true;
    }

    public static List<Integer> traverse(TreeNode node, List<Integer> resultList) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                resultList.add(node.val);
            }

            TreeNode left = node.left;
            traverse(left, resultList);
            TreeNode right = node.right;
            traverse(right, resultList);
        }

        return resultList;
    }
}
