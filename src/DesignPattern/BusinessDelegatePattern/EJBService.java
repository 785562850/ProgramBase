package DesignPattern.BusinessDelegatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
