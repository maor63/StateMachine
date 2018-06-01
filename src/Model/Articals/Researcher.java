package Model.Articals;

import Model.Manager;
import Model.State;

public class Researcher extends State {
    int readed = 8;

    public Researcher(Manager manager) {
        super(manager);
    }

    @Override
    public void read() {
        if(readed <= 10)
            readed++;
    }

    @Override
    public void status(String text) {
        super.status("***"+ text+"***");
    }
}
