package DesignPattern.FlyweightPattern;

import java.util.HashMap;

/**
 * 享元模式  结构型模式
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能
 * 提供了减少对象数量从而改善应用所需的对象结构的方式
 * 意图：运用共享技术有效地支持大量细粒度的对象。
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 * 使用场景： 1、系统有大量相似对象。
 *          2、需要缓冲池的场景。
 * 实例：1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
 *      2、数据库的数据池。
 * 使用方式：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。用 HashMap 存储这些对象。
 * 优点：大大减少对象的创建，降低系统的内存，使效率提高。
 * 缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
 * 注意： 1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。
 *       2、这些类必须有一个工厂对象加以控制。
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<String,Shape>();
    public static Shape getCircle(String color){
        Circle circle= (Circle) circleMap.get(color);
        if (circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);

        }
        return circle;
    }
}
