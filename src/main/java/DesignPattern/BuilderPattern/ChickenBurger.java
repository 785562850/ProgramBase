package DesignPattern.BuilderPattern;

/**
 * 鸡腿堡
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "鸡腿堡";
    }
}
