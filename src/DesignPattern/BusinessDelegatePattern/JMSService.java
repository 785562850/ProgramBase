package DesignPattern.BusinessDelegatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class JMSService  implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}