package usfx.structures.trees;

import usfx.structures.interfaces.IBinaryTree;

public class BinaryTree implements IBinaryTree {
    BTNode root;
    public BinaryTree(){
        root = null;
    }
    public BinaryTree(int data){
        root = new BTNode(data);
    }
    @Override
    public void insert(int data) {
        root = insertHelper(root, data);
    }
    private BTNode insertHelper(BTNode root, int data){
        if (root == null){
            return new BTNode(data);
        }
        if (data < root.data){
            root.left = insertHelper(root.left, data);
        } else if (data > root.data){
            root.right = insertHelper(root.right, data);
        }
        return root;
    }

    @Override
    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(BTNode root, int data){
        if (root == null){
            return false;
        }
        if (root.data == data){
            return true;
        }
        if (data < root.data){
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNodo(int data) {
        return getNodoHelper(root, data);
    }
    private BTNode getNodoHelper(BTNode root, int data){
        if (root == null){
            return null;
        }
        if (root.data == data){
            return root;
        }
        if (data < root.data){
            return getNodoHelper(root.left, data);
        } else {
            return getNodoHelper(root.right, data);
        }
    }

    @Override
    public void delete(int data) {
        root = deleteHelper(root, data);
        System.out.println("The node " + data + " has been deleted");
    }
    private BTNode deleteHelper(BTNode root, int data){
        if (root == null){
            return null;
        }
        if (data < root.data){
            root.left = deleteHelper(root.left, data);
        } else if (data > root.data){
            root.right = deleteHelper(root.right, data);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            root.data = minValue(root.right).data;
            root.right = deleteHelper(root.right, root.data);
        }
        return root;
    }
    private BTNode minValue(BTNode root){
        BTNode current = root;
        while (current.left != null){
            current = current.left;
        }
        return current;
    }

    @Override
    public int[] preOrder() {
        int[] result = new int[size()];
        preOrderHelper(root, result, 0);
        return result;
    }
    private int preOrderHelper(BTNode root, int[] result, int index){
        if (root != null) {
            // Visitar el nodo actual y almacenar su valor en el arreglo
            result[index] = root.data;
            index++;
            // Recorrer el subárbol izquierdo de forma recursiva
            index = preOrderHelper(root.left, result, index);
            // Recorrer el subárbol derecho de forma recursiva
            index = preOrderHelper(root.right, result, index);
        }
        return index;
    }
    @Override
    public int[] inOrder() {
        int[] result = new int[size()];
        inOrderHelper(root, result, 0);
        return result;
    }
    private int inOrderHelper(BTNode root, int[] res, int index){
        if (root != null) {
            index = inOrderHelper(root.left, res, index);
            res[index] = root.data;
            index++;
            index = inOrderHelper(root.right, res, index);
        }
        return index;
    }

    @Override
    public int[] postOrder() {
        int[] result = new int[size()];
        postOrderHelper(root, result, 0);
        return result;
    }
    private int postOrderHelper(BTNode root, int[] res, int index){
        if (root != null) {
            index = postOrderHelper(root.left, res, index);
            index = postOrderHelper(root.right, res, index);
            res[index] = root.data;
            index++;
        }
        return index;
    }
    @Override
    public int height() {
        return heightHelper(root);
    }
    private int heightHelper(BTNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = heightHelper(root.left);
        int rightHeight = heightHelper(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    @Override
    public int size() {
        return sizeHelper(root);
    }
    private int sizeHelper(BTNode root){
        if (root == null){
            return 0;
        }
        return sizeHelper(root.left) + sizeHelper(root.right) + 1;
    }
    @Override
    public void display() {
        displayHelper(root, 0);
    }
    private void displayHelper(BTNode root, int level){
        if (root == null){
            return;
        }
        displayHelper(root.right, level + 1);
        for (int i = 0; i < level; i++){
            System.out.print("   ");
        }
        System.out.println("[" + root.data + "]");
        displayHelper(root.left, level + 1);
    }
}
