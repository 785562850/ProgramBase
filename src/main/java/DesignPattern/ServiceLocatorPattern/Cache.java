package DesignPattern.ServiceLocatorPattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/4.
 */
public class Cache {
    private List<Service> serviceList;
    public Cache(){
        serviceList = new ArrayList<Service>();
    }
    public void addService(Service newService){
        boolean exists = false;
        for (Service service : serviceList) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            serviceList.add(newService);
        }

    }
    public Service getService(String serviceName){
        for (Service service : serviceList) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

}
