package leetcode.onehundreadone;

public class SymmetricOrMirrorTree {
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);

    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {

        // if the root is empty , then they are mirror image, last
        if (node1 == null && node2 == null) return true;

        // For two trees to be mirror images, the follwoing three condition should be true
        //1. root value must me equal
        //2. left subtree of the left tree and right subtree of the right tree have to               //   mirror image
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if (node1 != null && node2 != null && node1.val == node2.val)
            return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
