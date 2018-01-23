package DesignPattern.InterceptingFilterPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
