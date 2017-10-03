package DesignPattern.StatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class StopState implements State{
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}