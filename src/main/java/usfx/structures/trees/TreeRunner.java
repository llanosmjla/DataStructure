package usfx.structures.trees;

import usfx.structures.interfaces.IRunner;
import usfx.structures.menu.SimpleMenuItem;
import usfx.structures.menu.SubMenu;

import java.util.Scanner;

public class TreeRunner implements IRunner {
    @Override
    public void run() {
        int option = 0;
        String flag;
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        while (option != 12) {
            subMenu();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("**************************************");
                    System.out.println("********** Insert values in the tree **********");
                    binaryTree.insert(4);
                    binaryTree.insert(2);
                    binaryTree.insert(6);
                    binaryTree.insert(1);
                    binaryTree.insert(3);
                    binaryTree.insert(5);
                    binaryTree.insert(7);
                    binaryTree.display();
                    break;
                case 2:
                    System.out.println("**************************************");
                    System.out.println("********** Binary Search Tree **********");
                    int valueSearch = 0;
                    System.out.println("Enter the value to search: ");
                    valueSearch = scanner.nextInt();
                    if (binaryTree.search(valueSearch)) {
                        System.out.println("The value is in the tree");
                    } else {
                        System.out.println("The value is not in the tree");
                    }
                    break;
                case 3:
                    System.out.println("**************************************");
                    System.out.println("********** Preorder Traversal **********");
                    int[] preorder = binaryTree.preOrder();
                    for (int value : preorder) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("**************************************");
                    System.out.println("********** Inorder Traversal **********");
                    int[] inorder = binaryTree.inOrder();
                    for (int value : inorder) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("**************************************");
                    System.out.println("********** Postorder Traversal **********");
                    int[] postorder = binaryTree.postOrder();
                    for (int value : postorder) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("**************************************");
                    System.out.println("********** Height of the tree **********");
                    System.out.println("Height of the tree: " + binaryTree.height());
                    break;
                case 7:
                    System.out.println("**************************************");
                    System.out.println("********** Size of the tree **********");
                    System.out.println("Size of the tree: " + binaryTree.size());
                    break;
                case 8:
                    System.out.println("**************************************");
                    System.out.println("********** Delete a node **********");
                    int valueDelete = 0;
                    System.out.println("Enter the value to delete: ");
                    valueDelete = scanner.nextInt();
                    binaryTree.delete(valueDelete);
                    break;
                case 9:
                    System.out.println("**************************************");
                    System.out.println("********** Get a node **********");
                    int valueGet = 0;
                    System.out.print("Enter the value to get: ");
                    valueGet = scanner.nextInt();
                    var node = binaryTree.getNodo(valueGet);
                    if (node != null) {
                        System.out.println("The node is: " + node.data);
                    } else {
                        System.out.println("The node is not in the tree");
                    }
                    break;
                case 10:
                    System.out.println("**************************************");
                    System.out.println("********** Get the root **********");
                    var root = binaryTree.getRoot();
                    System.out.println("The root is: " + root.data);
                    break;
                case 11:
                    System.out.println("**************************************");
                    System.out.println("********** Display the tree **********");
                    binaryTree.display();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
    }

    public void subMenu() {
        SubMenu subMenu = new SubMenu("--------Tree--------");
        subMenu.addItem(new SimpleMenuItem("1. Insert values in the tree"));
        subMenu.addItem(new SimpleMenuItem("2. Binary Search Tree"));
        subMenu.addItem(new SimpleMenuItem("3. Tree Traversal Preorder"));
        subMenu.addItem(new SimpleMenuItem("4. Tree Traversal Inorder"));
        subMenu.addItem(new SimpleMenuItem("5. Tree Traversal Postorder"));
        subMenu.addItem(new SimpleMenuItem("6. Height of the tree"));
        subMenu.addItem(new SimpleMenuItem("7. Size of the tree"));
        subMenu.addItem(new SimpleMenuItem("8. Delete a node"));
        subMenu.addItem(new SimpleMenuItem("9. Get a node"));
        subMenu.addItem(new SimpleMenuItem("10. Get the root"));
        subMenu.addItem(new SimpleMenuItem("11. Display the tree"));
        subMenu.addItem(new SimpleMenuItem("12. Exit"));
        subMenu.display();
    }
}
