package usfx.structures.menu;

public class SubMenuFactory implements IMenuFactory{
    @Override
    public IMenuItem createMenuItem(String name) {
        return new SubMenu(name);
    }
}
