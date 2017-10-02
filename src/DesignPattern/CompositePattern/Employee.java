package DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式/部分整体模式 结构型模式
 * 依据树形结构来组合对象，用来表示部分以及整体层次
 * 意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 解决问题：客户程序与复杂元素的内部结构解耦
 * 使用场景：1、表示对象的部分-整体层次结构（树形结构），如树形菜单，文件、文件夹的管理。
 *          2、希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 * 实现方式：树枝和叶子实现统一接口，树枝内部组合该接口。
 *          树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 * 优点： 1、高层模块调用简单。
 *        2、节点自由增加。
 * 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 * 实例：1.JAVA中的SWING和AWT
 * △定义时为具体类
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee() {

    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
