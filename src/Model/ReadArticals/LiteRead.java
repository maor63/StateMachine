package Model.ReadArticals;

import Model.Main;
import Model.State;

public class LiteRead extends State {
    int readed = 3;
    Main m;
    @Override
    public void read() {
        if(readed == 8)
            m.reasercher();
        readed++;
    }

    @Override
    public void status(String text) {
        super.status("*"+ text+"*");
    }
}
