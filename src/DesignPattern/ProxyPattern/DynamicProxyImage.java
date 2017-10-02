package DesignPattern.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理模式
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 * 1.代理对象,不需要实现接口
 * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
 * 3.动态代理也叫做:JDK代理,接口代理
 */
public class DynamicProxyImage {

    private Image image;
    public DynamicProxyImage(Image image) {
        this.image=image;
    }


    public void display() {

        if(image==null){

          image=(Image) Proxy.newProxyInstance(
                 image.getClass().getClassLoader(),
                  image.getClass().getInterfaces(),
                  new InvocationHandler() {
                      @Override
                      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                          return method.invoke(image,args);
                      }
                  });
        }
        //可添加其他处理逻辑
       image.display();
        //可添加其他处理逻辑

    }
}
