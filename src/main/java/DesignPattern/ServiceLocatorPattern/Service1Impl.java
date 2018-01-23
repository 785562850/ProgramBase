package DesignPattern.ServiceLocatorPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Service1Impl implements Service {
    @Override
    public String getName() {
        return "Service1";
    }
    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
