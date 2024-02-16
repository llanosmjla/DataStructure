package usfx.structures.menu;

public class MenuClient {
    public static void main(String[] args) {
        IMenuFactory simpleFactory = new SimpleMenuFactory();
        IMenuFactory subMenuFactory = new SubMenuFactory();

        IMenuItem mainMenu = subMenuFactory.createMenuItem("Main Menu");
        IMenuItem listsSubMenu = subMenuFactory.createMenuItem("Lists");
        IMenuItem linkedListSubMenu = subMenuFactory.createMenuItem("Linked List");
        IMenuItem DoubleLinkedListSubMenu = subMenuFactory.createMenuItem("Double Linked List");

        IMenuItem addMenuItem = simpleFactory.createMenuItem("Add");
        IMenuItem deleteMenuItem = simpleFactory.createMenuItem("Delete");
        IMenuItem printMenuItem = simpleFactory.createMenuItem("Print");

        //linked list
        ((SubMenu) linkedListSubMenu).addItem(addMenuItem);
        ((SubMenu) linkedListSubMenu).addItem(deleteMenuItem);
        ((SubMenu) linkedListSubMenu).addItem(printMenuItem);
        //Double linked list
        ((SubMenu) DoubleLinkedListSubMenu).addItem(addMenuItem);
        ((SubMenu) DoubleLinkedListSubMenu).addItem(deleteMenuItem);
        ((SubMenu) DoubleLinkedListSubMenu).addItem(printMenuItem);


        ((SubMenu) listsSubMenu).addItem(linkedListSubMenu);
        ((SubMenu) listsSubMenu).addItem(DoubleLinkedListSubMenu);
        ((SubMenu) mainMenu).addItem(listsSubMenu);

        mainMenu.display();
    }
}
