package BinaryTree;

/**
 * 二叉树算法框架
 *
 * @author lau
 */
public class BinaryTreeFrame {

    /**
     * 二叉树都离不开以下几行代码
     * @param root
     */
    public void basic(TreeNode root) {
        // 前序遍历
        basic(root.left);
        // 中序遍历
        basic(root.right);
        // 后序遍历
    }


}
