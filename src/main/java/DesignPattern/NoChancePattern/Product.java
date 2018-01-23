package DesignPattern.NoChancePattern;

/**
 * Created by john on 2018/1/23.
 * 不变模式
 * 使用场景：当对象创建后，其内部状态和数据不再发生变化
 * 对象需要被共享，被多线程频繁访问
 * 实现方式：去除setter方法及所有修改自身属性的方法
 *          将所有属性设置为私有，并用final标记，确保其不可修改  属性private final标记
 *          确保没有子类可以重载他的行为  类使用final标记
 *          有一个创建完整对象的构造函数  构造函数必须指定数据
 * 应用：jdk中元数据包装类 如Integer String类
 */
public final class Product {
    private final String no;
    private final String name;
    private final double price;

    public Product(String no, String name, double price) {
        super();
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
