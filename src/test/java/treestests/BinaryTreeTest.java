package treestests;

import org.junit.Test;
import usfx.structures.interfaces.IBinaryTree;
import usfx.structures.trees.BinaryTree;

import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {
    IBinaryTree tree = new BinaryTree();
    // Test insert
    @Test
    public void insertTest(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        assert tree.size() == 3;
    }
    // Test search
    @Test
    public void searchTest(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertTrue(tree.search(1));
    }
    // Test getRoot
    @Test
    public void getRootTest(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertTrue(tree.getRoot().getData() == 1);
    }
    // Test getNodo
    @Test
    public void getNodoTest(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertTrue(tree.getNodo(2).getData() == 2);
    }
    // Test delete
    @Test
    public void deleteTest(){
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.delete(2);
        assertTrue(tree.size() == 2);
    }
    // Test preOrder
    @Test
    public void preOrderTest(){
        int[] data = {4, 2, 6, 1, 3, 5, 7};
        int[] preOrderExpected = {4, 2, 1, 3, 6, 5, 7};
        for (int i : data) {
            tree.insert(i);
        }
        int[] preOrder = tree.preOrder();
        for (int i = 0; i < data.length; i++) {
            assertTrue(preOrderExpected[i] == preOrder[i]);
        }
    }
    // Test inOrder
    @Test
    public void inOrderTest(){
        int[] data = {4, 2, 6, 1, 3, 5, 7};
        int[] inOrderExpected = {1, 2, 3, 4, 5, 6, 7};
        for (int i : data) {
            tree.insert(i);
        }
        int[] inOrder = tree.inOrder();
        for (int i = 0; i < data.length; i++) {
            assertTrue(inOrderExpected[i] == inOrder[i]);
        }
    }
    // Test postOrder
    @Test
    public void postOrderTest(){
        int[] data = {4, 2, 6, 1, 3, 5, 7};
        int[] postOrderExpected = {1, 3, 2, 5, 7, 6, 4};
        for (int i : data) {
            tree.insert(i);
        }
        int[] postOrder = tree.postOrder();
        for (int i = 0; i < data.length; i++) {
            assertTrue(postOrderExpected[i] == postOrder[i]);
        }
    }
    // Test height
    @Test
    public void heightTest(){
        int[] data = {4, 2, 6, 1, 3, 5, 7};
        for (int i : data) {
            tree.insert(i);
        }
        assertTrue(tree.height() == 3);
    }
    // Test size
    @Test
    public void sizeTest(){
        int[] data = {4, 2, 6, 1, 3, 5, 7};
        for (int i : data) {
            tree.insert(i);
        }
        assertTrue(tree.size() == 7);
    }
}
