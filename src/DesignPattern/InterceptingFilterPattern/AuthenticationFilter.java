package DesignPattern.InterceptingFilterPattern;

/**
 * Created by john on 2017/10/4.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
