package DesignPattern.FacadePattern;

/**
 * 外观模式/门面模式  结构型模式
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 解决问题：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口
 * 实现方式：一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用（将调用顺序、依赖关系等处理好），使客户端不与系统耦合，外观类与系统耦合
 * 使用场景：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
 *          1、为复杂的模块或子系统提供外界访问的模块。
 *          2、子系统相对独立。
 *          3、预防低水平人员带来的风险。
 *          4、定义系统的入口。
 * 优点：1、减少系统相互依赖。
 *      2、提高灵活性。
 *      3、提高了安全性。
 * 缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 * 实例：1.JAVA三层开发模式（MVC）
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
