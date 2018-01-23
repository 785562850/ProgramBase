package DesignPattern.AbstractFactoryPattern;
/**
 * 抽象工厂模式 围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * 创建型模式
 * 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 使用场景：在一个产品族里面，定义多个产品。
 * 实例：1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 * △注意类爆炸
 */
public  abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
