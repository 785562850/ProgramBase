package DesignPattern.PrototypePattern;

/**
 * Created by john on 2017/10/1.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("I'm Circle!");
    }
}
