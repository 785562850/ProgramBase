package DesignPattern.ServiceLocatorPattern;

/**
 * Created by john on 2017/10/4.
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if("SERVICE1".equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1Impl();
        }else if ("SERVICE2".equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2Impl();
        }
        return null;
    }
}
