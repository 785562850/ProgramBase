package DesignPattern.ProxyPattern;

/**
 * 代理模式 结构型模式
 * 代理模式中，创建具有现有对象的对象，以便向外界提供功能接口。
 * 意图：为其他对象提供一种代理以控制对这个对象的访问。
 * 解决问题：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * 使用场景：按职责来划分，通常有以下使用场景：
 *      1、远程代理。
 *      2、虚拟代理。
 *      3、Copy-on-Write 代理。
 *      4、保护（Protect or Access）代理。
 *      5、Cache代理。
 *      6、防火墙（Firewall）代理。
 *      7、同步化（Synchronization）代理。
 *      8、智能引用（Smart Reference）代理。
 * 实例：1.Windows 里面的快捷方式
 *      2.Spring AOP
 * 实现方式：增加中间层，实现与被代理类组合
 * 优点： 1、职责清晰。 2、高扩展性。 3、智能化。
 * 缺点： 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 *       2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 注意： 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 *       2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 */
/**
 * 静态代理模式 可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */

public class StaticProxyImage implements Image{


     private RealImage realImage;
    private String fileName;

    public StaticProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        //可添加其他处理逻辑
        realImage.display();
        //可添加其他处理逻辑
    }
}
