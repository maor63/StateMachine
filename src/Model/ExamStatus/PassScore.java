package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class PassScore extends State
{
    public PassScore(Manager manager) {
        super(manager);
    }

    @Override
    public void status(String text) {
        super.status(text + " :)");
    }
}
