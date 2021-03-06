package DesignPattern.VisitorPattern;

/**
 * 访问者模式  行为型模式
 * 使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * 意图：主要将数据结构与数据操作分离。
 * 解决问题：稳定的数据结构和易变的操作耦合问题。
 * 使用场景：1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 *         2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 * 优点：1、符合单一职责原则。
 *      2、优秀的扩展性。
 *      3、灵活性。
 * 缺点：1、具体元素对访问者公布细节，违反了迪米特原则。
 *      2、具体元素变更比较困难。
 *      3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 * 实现方式：在被访问的类里面加一个对外提供接待访问者的接口。
 *          在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
 * 注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(KeyBoard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
