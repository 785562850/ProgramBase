package DesignPattern.PrototypePattern;

/**
 * Created by john on 2017/10/1.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        Shape clonedShape11 = (Shape) ShapeCache.getShape("11");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Shape11 : " + clonedShape11.getType());
        System.out.println(clonedShape==clonedShape11);
        System.out.println(clonedShape.getColor()==clonedShape11.getColor());
        System.out.println(clonedShape.getType()==clonedShape11.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        Shape clonedShape22 = (Shape) ShapeCache.getShape("22");
        System.out.println("Shape22 : " + clonedShape22.getType());
        System.out.println(clonedShape2==clonedShape22);
        System.out.println(clonedShape2.getColor()==clonedShape22.getColor());
        System.out.println(clonedShape2.getType()==clonedShape22.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
