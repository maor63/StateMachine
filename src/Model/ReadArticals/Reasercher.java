package Model.ReadArticals;

import Model.Main;
import Model.State;

public class Reasercher extends State {
    int readed = 8;
    Main m;
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
