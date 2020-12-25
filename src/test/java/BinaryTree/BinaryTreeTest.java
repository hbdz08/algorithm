package BinaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
private BinaryTree binaryTree = new BinaryTree();
private TreeNode treeNode;

    @BeforeEach
    void init() {
        treeNode = new TreeNode(10);


    }

    @Test
    void invertTree(){
        System.out.println( binaryTree.invertTree(treeNode));
    }
}