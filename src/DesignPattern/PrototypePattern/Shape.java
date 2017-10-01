package DesignPattern.PrototypePattern;

import java.io.*;

/**
 * 原型模式 创建型模式
 * 用于创建重复的对象，同时又能保证性能
 * 实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式
 *
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
    * 浅复制
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
    * 深复制 复制类和引用类型都需实现 Serializable接口
    *深复制不仅在堆内存上开辟了空间以存储复制出的对象，甚至连对象中的引用类型的属性所指向的对象也得以复制，重新开辟了堆空间存储
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
