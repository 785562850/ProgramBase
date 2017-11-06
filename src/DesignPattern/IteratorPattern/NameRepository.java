package DesignPattern.IteratorPattern;

/**
 * 迭代器模式 行为型模式
 * 用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 解决问题：不同的方式来遍历整个整合对象。
 * 使用场景： 1、访问一个聚合对象的内容而无须暴露它的内部表示。
 *          2、需要为聚合对象提供多种遍历方式。
 *          3、为遍历不同的聚合结构提供一个统一的接口。
 * 实现方式：把在元素之间游走的责任交给迭代器，而不是聚合对象。
 *          定义接口：hasNext, next。
 * 注意：注意事项：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。
 */
public class NameRepository implements Container{
    public String[] names = {"Robert", "John", "Julie", "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
       int index=0;
        @Override
        public boolean hasNext() {
            if(index<names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
