package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式 行为型模式
 * 一种数据驱动的设计模式，请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 * 解决问题：行为请求者与行为实现者之间无法抵御变化的紧耦合的关系
 * 使用场景：认为是命令的地方都可以使用命令模式
 * 优点： 1、降低了系统耦合度。
 *       2、新的命令可以很容易添加到系统中去。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 * 实现方式：：定义三个角色：1、received 真正的命令执行对象 2、Command 3、invoker 使用命令对象的入口
 *                      通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
 */
public class OrderBroker {
    private List<Order> orderList=new ArrayList<Order>();
    public void addOrder(Order order){
        orderList.add(order);
    }

    public void executeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
