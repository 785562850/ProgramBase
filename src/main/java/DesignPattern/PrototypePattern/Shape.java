package DesignPattern.PrototypePattern;

import java.io.*;

/**
 * 原型模式 创建型模式
 * 用于创建重复的对象，同时又能保证性能
 * 实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 解决问题：在运行期建立和删除原型。
 * 使用场景：1、当一个系统应该独立于它的产品创建，构成和表示时。
 *          2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *          3、为了避免创建一个与产品类层次平行的工厂类层次时。
 *          4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *使用场景：
 * 1、资源优化场景。
 * 2、类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
 * 3、性能和安全要求的场景。
 * 4、通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 * 5、一个对象多个修改者的场景。
 * 6、一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 * 7、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，
 */

public abstract class Shape implements Cloneable,Serializable{
    private String id;
    protected String type;
    private Color color;
    abstract void draw();
    public void setColor(Color color){
        this.color=color;
    }
    public Color getColor(){
        return this.color;
    }
    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /*
    * 浅复制 实现 Cloneable，重写
    * 复制出来的对象重新在堆上开辟了内存空间，但是，对象中各属性（基本数据类型）确保持相等。
    * △引用类型的属性所指向的对象并没有复制
    * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    /*
    * 深复制  实现Serializable 读取二进制流。
    *   复制类和引用类型都需实现 Serializable接口
    *   深复制不仅在堆内存上开辟了空间以存储复制出的对象，甚至连对象中的引用类型的属性所指向的对象也得以复制，重新开辟了堆空间存储
     *  */
    public Shape deepClone() throws IOException, ClassNotFoundException {
        Object clone = null;
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);

        return (Shape)objectInputStream.readObject();
    }
}
