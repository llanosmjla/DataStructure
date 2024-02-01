package usfx.structures;

import usfx.structures.interfaces.IRunner;

public class NullRunner implements IRunner {
    @Override
    public void run() {
        System.out.println("Running NullRunner");
    }

}
