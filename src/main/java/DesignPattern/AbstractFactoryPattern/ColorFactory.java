package DesignPattern.AbstractFactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        } else if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        } else if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
    public Object getColor(Class<? extends Color> clazz){
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
}
