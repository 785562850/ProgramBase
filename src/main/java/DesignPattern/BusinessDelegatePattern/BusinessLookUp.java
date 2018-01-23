package DesignPattern.BusinessDelegatePattern;

/**
 * Created by john on 2017/10/3.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if("EJB".equalsIgnoreCase(serviceType)){
            return new EJBServiceImpl();
        }else {
            return new JMSServiceImpl();
        }
    }
}
