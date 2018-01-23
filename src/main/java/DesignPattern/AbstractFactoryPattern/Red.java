package DesignPattern.AbstractFactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("I'm Red!");
    }
}