package DesignPattern.DecoratorPattern;

/**
 * Created by john on 2017/10/2.
 */
public class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator() {
    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
