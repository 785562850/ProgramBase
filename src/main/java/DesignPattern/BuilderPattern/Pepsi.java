package DesignPattern.BuilderPattern;

/**
 * 百事可乐
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 5.0f;
    }

    @Override
    public String name() {
        return "百事可乐";
    }
}
