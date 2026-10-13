class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftdep = leftdepth(root);
        int rightdep = rightdepth(root);

        if (leftdep == rightdep) {
            return (int) Math.pow(2, leftdep) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int leftdepth(TreeNode root) {
        int dep = 0;

        while (root != null) {
            dep++;
            root = root.left;
        }

        return dep;
    }

    private int rightdepth(TreeNode root) {
        int dep = 0;

        while (root != null) {
            dep++;
            root = root.right;
        }

        return dep;
    }
}