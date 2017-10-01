package DesignPattern.PrototypePattern;

/**
 * Created by john on 2017/10/1.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("I'm Rectangle!");
    }
}
