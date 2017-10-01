package DesignPattern.AbstractFactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


    public Object getShape(Class<? extends Shape> clazz){
        Object obj=null;
        try {
            obj=Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    @Override
    Color getColor(String color) {
        return null;
    }
}
