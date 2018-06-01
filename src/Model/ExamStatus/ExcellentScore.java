package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class ExcellentScore extends State
{
    public ExcellentScore(Manager manager) {
        super(manager);
    }

    @Override
    public void status(String text) {
        super.status("^^^" + text + "^^^");
    }
}
