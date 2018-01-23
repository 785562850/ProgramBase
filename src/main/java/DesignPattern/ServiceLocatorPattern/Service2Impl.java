package DesignPattern.ServiceLocatorPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Service2Impl implements Service {
    @Override
    public String getName() {
        return "Service2";
    }
    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
