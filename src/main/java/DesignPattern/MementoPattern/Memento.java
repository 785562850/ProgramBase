package DesignPattern.MementoPattern;

/**
 * Created by john on 2017/10/2.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
