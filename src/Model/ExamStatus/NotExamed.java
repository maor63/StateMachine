package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class NotExamed extends State
{
    Manager m;

    public NotExamed(Manager manager) {
        super(manager);
    }

    @Override
    public void exam(int score) {
        if (m.isLiteReader()) super.exam(score);
        else if (score < 56) m.setFailedExam();
        else if (score < 90) m.setPassScore();
        else m.setExelentScore();
    }
}
