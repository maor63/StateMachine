package Model.Articals;

import Model.Manager;
import Model.State;

public class BearlyRead extends State {
    private int readed = 0;
    public BearlyRead(Manager manager) {
        super(manager);
    }

    @Override
    public void read() {
        if(readed == 2)
            manager.setLiteReader();
        readed++;
    }

    @Override
    public void status(String text) {
        super.status(text);
    }
}
