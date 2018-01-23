package DesignPattern.SinglePattern;

/**
 * Created by john on 2017/10/1.
 */
public class SingleBeanDemo {
    public static void main(String[] args) {
        SingleBean singleBean1=SingleBean.getInstance();
        SingleBean singleBean2=SingleBean.getInstance();
        System.out.println("singleBean1:"+singleBean1.hashCode()+"\nsingleBean2:"+singleBean2.hashCode());
        System.out.println(singleBean1.equals(singleBean2));
        System.out.println(singleBean1==singleBean2);
    }
}
