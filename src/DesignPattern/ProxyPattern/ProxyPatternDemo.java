package DesignPattern.ProxyPattern;

/**
 * Created by john on 2017/10/2.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {

        StaticProxyImage staticProxyImage=new StaticProxyImage("test_10mb.jpg");
        staticProxyImage.display();
        System.out.println("");
        staticProxyImage.display();

        DynamicProxyImage dynamicProxyImage= new DynamicProxyImage(new RealImage("test_10mb.jpg"));
        dynamicProxyImage.display();
        System.out.println("");
        dynamicProxyImage.display();
    }
}
