package Model.Articals;

import Model.Manager;
import Model.State;

public class LiteRead extends State {
    int readed = 3;

    public LiteRead(Manager manager) {
        super(manager);
    }

    @Override
    public void read() {
        if(readed == 8)
            manager.setReasercher();
        readed++;
    }

    @Override
    public void status(String text) {
        super.status("*"+ text+"*");
    }
}
