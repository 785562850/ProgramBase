package DesignPattern.DecoratorPattern;

/**
 * 装饰器模式 结构型模式
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构,它是作为现有的类的一个包装
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 解决问题：为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 * 使用场景：在不想增加很多子类的情况下扩展类。
 *          1、扩展一个类的功能。
 *          2、动态增加功能，动态撤销。
 * 实例：JAVA I/O
 * 实现方式： 将具体功能职责划分，同时继承装饰者模式。
 *          1、Component 类充当抽象角色，不应该具体实现。
 *          2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：多层装饰比较复杂。
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
