package usfx.structures.menu;

import java.util.ArrayList;
import java.util.List;

public class SubMenu implements IMenuItem{
    private final String name;
    private List<IMenuItem> menuItems = new ArrayList<IMenuItem>();

    public SubMenu(String name) {
        this.name = name;
    }

    public void addItem(IMenuItem menuItem) {
        menuItems.add(menuItem);
    }
    @Override
    public void display() {
        System.out.println(name);
        for (IMenuItem menuItem : menuItems) {
            menuItem.display();
        }
    }
}
