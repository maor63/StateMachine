package Model;

public abstract class State {
    public void exam(int score){}

    public void read(){}

    public void post(String text){}

    public void anwser(){}

    public void next_week(){}

    public void status(String text){
        System.out.println(text);
    }
}
