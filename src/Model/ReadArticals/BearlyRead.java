package Model.ReadArticals;

import Model.Main;
import Model.State;

public class BearlyRead extends State {
    int readed = 0;
    Main m;
    @Override
    public void read() {
        if(readed == 3)
            m.liteReader();
        readed++;
    }

    @Override
    public void status(String text) {
        super.status(text);
    }
}
