package DesignPattern.AbstractFactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= (ShapeFactory) FactoryBulider.getFactory(ShapeFactory.class);
        ColorFactory colorFactory= (ColorFactory) FactoryBulider.getFactory(ColorFactory.class);
        Circle circle= (Circle) shapeFactory.getShape(Circle.class);
        Red red= (Red) colorFactory.getColor(Red.class);
        circle.draw();
        red.fill();
        AbstractFactory shaprFactory1=FactoryBulider.getFactory("Shape");
        AbstractFactory colorFactory1=FactoryBulider.getFactory("Color");
        Shape shape=shaprFactory1.getShape("Square");
        Color color=colorFactory1.getColor("Blue");
        shape.draw();
        color.fill();

    }
}
