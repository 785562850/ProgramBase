package DesignPattern.ServiceLocatorPattern;

/**
 * Created by john on 2017/10/4.
 */
public class ServiceLocator {
    private static  Cache cache;
    static {
        cache=new Cache();
    }
    public static Service getService(String serviceName){
        Service service=cache.getService(serviceName);
        if(service==null){
            InitialContext initialContext=new InitialContext();
            service=(Service) initialContext.lookup(serviceName);
            cache.addService(service);
        }
        return service;
    }
}
