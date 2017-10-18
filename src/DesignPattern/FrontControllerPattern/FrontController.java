package DesignPattern.FrontControllerPattern;

/**
 * Created by john on 2017/10/4.
 */
public class FrontController {
    private Dispatcher dispatcher;
    public FrontController(){
        dispatcher = new Dispatcher();
    }
    //验证用户身份信息
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }
    //记录请求
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }
    public void dispatchRequest(String request){

        trackRequest(request);

        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
