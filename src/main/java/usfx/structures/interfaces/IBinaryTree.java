package usfx.structures.interfaces;

import usfx.structures.trees.BTNode;

public interface IBinaryTree {
    void insert(int data);
    boolean search(int data);
    BTNode getRoot();
    BTNode getNodo(int data);
    void delete(int data);
    int[] preOrder();
    int[] inOrder();
    int[] postOrder();
    int height();
    int size();

    void display();
}
