package Model.Quizes;

import Model.Manager;
import Model.State;

public class NotQuiz extends State
{
    int quiz_num = 1;
    int last_anwsered = 0;
    public NotQuiz(Manager manager) {
        super(manager);
    }

    @Override
    public void anwser() {
        if(last_anwsered < quiz_num) {
            manager.setAnswerQuiz(quiz_num);
            last_anwsered = quiz_num;
        }
        else
            super.anwser();
    }

    @Override
    public void next_week() {
        if(quiz_num < 12)
            quiz_num++;
        else
            super.next_week();
    }

    @Override
    public void status(String text) {
        super.status(text);
    }
}
