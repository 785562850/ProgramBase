package DesignPattern.BuilderPattern;

/**
 * 可口可乐
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 5.0f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
