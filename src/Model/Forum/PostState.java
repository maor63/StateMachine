package Model.Forum;

import Model.Manager;
import Model.State;

public class PostState extends State
{
    public int post_count = 0;
    public PostState(Manager manager) {
        super(manager);
    }

    @Override
    public void post(String text) {
        super.post(text);
        post_count++;
    }

    @Override
    public void next_week() {
        post_count = 0;
    }

    @Override
    public void status(String text) {
        if(post_count >= 2)
            super.status(text + "(active)");
        else
            super.status(text);
    }
}
