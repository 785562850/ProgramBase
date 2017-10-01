package DesignPattern.FactoryPattern;

import DesignPattern.SinglePattern.SingleBean;

/**
 * 工厂模式
 * 创建型模式，通过使用一个共同的接口来指向新创建的对象。
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 解决问题：主要解决接口选择的问题
 * 使用场景：明确地计划不同条件下创建不同实例时
 */
public class BeanFactory {
        public SingleBean getSingleBean(){
           return SingleBean.getInstance();
        }
}
