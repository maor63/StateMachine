package Model;

import Model.Articals.BearlyRead;
import Model.Articals.LiteRead;
import Model.Articals.Researcher;
import Model.ExamStatus.ExcellentScore;
import Model.ExamStatus.FailedExam;
import Model.ExamStatus.NotExamed;
import Model.ExamStatus.PassScore;
import Model.Forum.PostState;
import Model.Quizes.AnswerQuiz;
import Model.Quizes.NotQuiz;

import java.util.ArrayList;
import java.util.List;

public class Manager
{
    State bearlyReader;
    State liteRead;
    State reasercher;
    State excellentScore;
    State failedExam;
    State notExamed;
    State passScore;
    State postState;
    State answerQuiz;
    State notQuiz;
    State currStateRead;
    State currStateExam;
    State currStateFroum;
    State currStateQuiz;
    List<State> currStates;

    public Manager() {
        bearlyReader = new BearlyRead(this);
        liteRead = new LiteRead(this);
        reasercher = new Researcher(this);
        excellentScore = new ExcellentScore(this);
        failedExam = new FailedExam(this);
        notExamed = new NotExamed(this);
        passScore = new PassScore(this);
        postState = new PostState(this);
        answerQuiz = new AnswerQuiz(this);
        notQuiz = new NotQuiz(this);
        currStateRead = bearlyReader;
        currStateExam = notExamed;
        currStateFroum = postState;
        currStateQuiz = notQuiz;
        currStates = new ArrayList<>();
        currStates.add(currStateRead);
        currStates.add(currStateExam);
        currStates.add(currStateFroum);
        currStates.add(currStateQuiz);
    }

    public void excuteCommand(String command, String arg) {
        switch (command) {
            case "exam":
                int score = Integer.parseInt(arg);
                currStates.forEach(s->s.exam(score));
                break;
            case "read":
                currStates.forEach(State::read);
                break;
            case "post":
                currStates.forEach(s->s.post(arg));
                break;
            case "answer":
                currStates.forEach(State::anwser);
                break;
            case "next_week":
                currStates.forEach(State::next_week);
                break;
            case "status":
                currStates.forEach(s->s.status(arg));
                break;
            default:
                System.out.println("Illegal command");
        }
    }

    public void setLiteReader() {
        System.out.println("enter LiteReader state");
        currStateRead = liteRead;
    }

    public void setReasercher() {
        System.out.println("enter Researcher state");
        currStateRead = reasercher;
    }

    public boolean isLiteReader() {
        return currStateRead instanceof LiteRead;
    }

    public void setFailedExam() {
        System.out.println("enter FailedExam state");
        currStateExam = failedExam;
    }

    public void setPassScore() {
        System.out.println("enter PassScore state");
        currStateExam = passScore;
    }

    public void setExcellentScore() {
        System.out.println("enter ExcellentScore state");
        currStateExam = excellentScore;
    }

    public void setAnswerQuiz(int quiz_num) {
        System.out.println("enter AnswerQuiz state");
        currStateQuiz = answerQuiz;
    }

    public void setNotQuiz() {
        System.out.println("enter NotQuiz state");
        currStateQuiz = notQuiz;
    }
}
