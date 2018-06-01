package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class NotExamed extends State
{
    public NotExamed(Manager manager) {
        super(manager);
    }

    @Override
    public void exam(int score) {
        if (manager.isLiteReader()) super.exam(score);
        else if (score < 56) manager.setFailedExam();
        else if (score < 90) manager.setPassScore();
        else manager.setExcellentScore();
    }
}
