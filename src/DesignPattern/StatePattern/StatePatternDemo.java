package DesignPattern.StatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());
    }
}