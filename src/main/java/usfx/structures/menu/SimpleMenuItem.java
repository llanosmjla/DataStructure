package usfx.structures.menu;

public class SimpleMenuItem implements IMenuItem{

    private final String name;

    public SimpleMenuItem(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println(name);
    }
}
