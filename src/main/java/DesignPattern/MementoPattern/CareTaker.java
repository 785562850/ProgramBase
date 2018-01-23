package DesignPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录 行为型模式
 * 保存一个对象的某个状态，以便在适当的时候恢复对象
 * 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 使用场景： 1、需要保存/恢复数据的相关状态场景。
 *          2、提供一个可回滚的操作。
 *  实例：1.数据库的事务管理。
 *       2.ctrl+z
 *  优点： 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。
 *        2、实现了信息的封装，使得用户不需要关心状态的保存细节。
 *  缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *  实现方式：通过一个备忘录类专门存储对象状态
 */
public class CareTaker {
    List<Memento> mementoList=new ArrayList<Memento>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
