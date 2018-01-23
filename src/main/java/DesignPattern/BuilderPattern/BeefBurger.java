package DesignPattern.BuilderPattern;

/**
 * 牛肉堡
 */
public class BeefBurger extends Burger{
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "牛肉堡";
    }
}
