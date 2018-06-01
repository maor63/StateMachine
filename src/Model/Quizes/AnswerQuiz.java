package Model.Quizes;

import Model.Manager;
import Model.State;

public class AnswerQuiz extends State
{
    public AnswerQuiz(Manager manager) {
        super(manager);
    }

    public void answerQuiz(int quiz_num){
        loadQuiz(quiz_num);
        manager.setNotQuiz();
    }

    private void loadQuiz(int quiz_num) {

    }

}
