package DesignPattern.BuilderPattern;

/**
 * 建造者模式 创建型模式
 * 使用多个简单的对象一步一步构建成一个复杂的对象
 * 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 解决问题：一个‘复杂对象’的创建工作，其通常由各个部分的子对象用一定的算法构成；
 * 由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 * 使用场景： 一些基本部件不会变，而其组合经常变化的时候。
 *          1、需要生成的对象具有复杂的内部结构。
 *          2、需要生成的对象内部属性本身相互依赖。
 */
public class MealBuilder {
    public Meal getChickenMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal getBeefMeal(){
        Meal meal=new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
