package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式 行为型模式
 * 当一个对象被修改时，则会自动通知它的依赖对象
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 解决问题：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 * 使用场景：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 *          1、有多个子类共有的方法，且逻辑相同。
 *          2、重要的、复杂的方法，可以考虑作为模板方法。
 * 优点：1、观察者和被观察者是抽象耦合的。
 *      2、建立一套触发机制。
 * 缺点：1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
 *      2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 *      3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 * 实现方式：：在抽象类里有一个 ArrayList 存放观察者们。
 * 注意事项： 1、JAVA 中已经有了对观察者模式的支持类。
 *          2、避免循环引用。
 *          3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 */
public class Subject {
    private List<Observer> observerList=new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer:observerList) {
            observer.update();
        }
    }
}
