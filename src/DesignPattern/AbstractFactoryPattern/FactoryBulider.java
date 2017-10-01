package DesignPattern.AbstractFactoryPattern;

/**
 * Created by john on 2017/10/1.
 */
public class FactoryBulider {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
    public static Object getFactory(Class<? extends AbstractFactory> clazz){
        Object obj=null;
        try {
            obj= Class.forName(clazz.getName()).newInstance();
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
