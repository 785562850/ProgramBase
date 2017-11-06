package DesignPattern.FrontControllerPattern;

/**
 * Created by john on 2017/10/4.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }
    public void dispatch(String request){
        if("home".equalsIgnoreCase(request)){
            homeView.show();
        }else {
            studentView.show();
        }
    }
}
