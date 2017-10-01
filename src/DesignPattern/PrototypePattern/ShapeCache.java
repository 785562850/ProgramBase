package DesignPattern.PrototypePattern;
import sun.security.provider.SHA;

import java.io.IOException;
import java.util.Hashtable;
/**
 * 模拟从数据库取出实体类
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();
    public static Shape getShape(String shapeId){
        Shape shape=shapeMap.get(shapeId);
        try {
            return (Shape)shape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shape;
    }
    public static void loadCache() {
        Color red=new Red();
        Color green=new Green();
        Circle redCircle1 = new Circle();
        redCircle1.setId("1");
        redCircle1.setColor(red);
        shapeMap.put(redCircle1.getId(),redCircle1);

        Circle redCircle2 = new Circle();
        redCircle2.setId("11");
        redCircle2.setColor(red);
        shapeMap.put(redCircle2.getId(),redCircle2);

        Square square = new Square();
        square.setId("2");
        square.setColor(green);
        shapeMap.put(square.getId(),square);
        Square square1=null;
        try {

            square1 = (Square) square.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        square1.setId("22");
        shapeMap.put(square1.getId(),square1);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
