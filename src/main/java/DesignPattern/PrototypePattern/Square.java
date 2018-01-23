package DesignPattern.PrototypePattern;

/**
 * Created by john on 2017/10/1.
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("I'm Square");
    }
}
