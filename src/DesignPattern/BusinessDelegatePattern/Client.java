package DesignPattern.BusinessDelegatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
