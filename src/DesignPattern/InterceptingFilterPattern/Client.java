package DesignPattern.InterceptingFilterPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Client {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
