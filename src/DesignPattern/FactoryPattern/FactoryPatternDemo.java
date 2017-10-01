package DesignPattern.FactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        Shape shape1=ShapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2=ShapeFactory.getShape("rectangle");
        shape2.draw();
        Shape shape3=ShapeFactory.getShape("square");
        shape3.draw();
        Circle circle= (Circle)ShapeFactory.getBean(Circle.class);
        circle.draw();
    }
}
