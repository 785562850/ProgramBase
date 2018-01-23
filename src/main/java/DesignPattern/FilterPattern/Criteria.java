package DesignPattern.FilterPattern;

import java.util.List;

/**
 * 过滤器模式 结构型模式
 * 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来
 */
public interface Criteria {

    public  List<Person> meetCriteria(List<Person> persons);
}
