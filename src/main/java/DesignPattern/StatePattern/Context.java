package DesignPattern.StatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
