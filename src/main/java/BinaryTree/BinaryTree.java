package BinaryTree;
/**
 *
 * @author lau
 */
public class BinaryTree {
    /**
     * 二叉树翻转
     * leetcode 226题
     * https://leetcode-cn.com/problems/invert-binary-tree/submissions/
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 前序遍历位置
        // root 节点需要交换她的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        // 递归，让左右字节点继续翻转
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
