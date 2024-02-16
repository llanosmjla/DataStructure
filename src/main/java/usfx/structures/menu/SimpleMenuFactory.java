package usfx.structures.menu;

public class SimpleMenuFactory implements IMenuFactory {

    @Override
    public IMenuItem createMenuItem(String name) {
        return new SimpleMenuItem(name);
    }
}
