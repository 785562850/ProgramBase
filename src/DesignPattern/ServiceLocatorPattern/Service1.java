package DesignPattern.ServiceLocatorPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Service1  implements Service {
    @Override
    public String getName() {
        return "Service1";
    }
    public void execute() {
        System.out.println("Executing Service1");
    }
}
