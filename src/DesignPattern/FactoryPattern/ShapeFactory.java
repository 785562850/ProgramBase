package DesignPattern.FactoryPattern;


import sun.security.provider.SHA;

/**
 * 工厂模式
 * 创建型模式，通过使用一个共同的接口来指向新创建的对象。
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 解决问题：主要解决接口选择的问题
 * 使用场景：明确地计划不同条件下创建不同实例时
 * 需要生成复杂对象(构造函数有很多参数)的地方，都可以使用工厂方法模式。
 * 直接用new可以完成的不需要用工厂模式
 */
public class ShapeFactory {
        /*普通模式 也称静态工厂
         * 1.扩展性差
         *2.不同的产品需要不同额外参数的时候 不支持。
        */
     public static Shape getShape(String shapeType){
         if(shapeType==null){
             return null;
         }
         if(shapeType.equalsIgnoreCase("Square")){
             return new Square();
         }else if(shapeType.equalsIgnoreCase("Circle")){
             return  new Circle();
         }else if(shapeType.equalsIgnoreCase("Rectangle")){
             return new Rectangle();
         }
         return null;
     }
    /*反射模式
    利用反射机制生成对象，增加一种产品时，不需要修改create()的代码。
    1.因为Class.forName(clz.getName()).newInstance()调用的是无参构造函数生成对象，它和new Object()是一样的性质，而工厂方法应该用于复杂对象的初始化 ，当需要调用有参的构造函数时便无能为力了，这样像为了工厂而工厂。

    2.不同的产品需要不同额外参数的时候 不支持。
    */
    public static Object getBean(Class<? extends Shape> clazz){
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
    /*多方法模式
    * 不同产品，提供不同的生产方法
    * */
    public static Shape getCircle(){
        return new Circle();
    }
    public static Shape getSquare(){
        return new Square();
    }
    public static Shape getRectangle(){
        return new Rectangle();
    }
}
