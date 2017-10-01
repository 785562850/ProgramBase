package DesignPattern.SinglePattern;

/**
 * 单例模式 自己创建实例+构造方法私有化
 * 创建型模式
 * 解决问题：一个全局使用的类频繁地创建与销毁
 * 使用场景：想控制实例数目，节省系统资源的时候
 *  注意：1、单例类只能有一个实例。
 *       2、单例类必须自己创建自己的唯一实例。
 *       3、单例类必须给所有其他对象提供这一实例。
 * getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
 */
public class SingleBean {

   /*
     * 懒汉式，线程不安全
     * Lazy初始化
     * 多线程不安全（没加synchronize锁）
     *不支持多线程,严格意义上并不算单例模式
      */
   /*
    private static SingleBean singleBean;
    private SingleBean(){

    }
    public static SingleBean getInstance(){
        if(singleBean==null){
            singleBean=new SingleBean();
        }
        return singleBean;
    }
    */
    /*
     * 懒汉式，线程安全
     * Lazy初始化
     * 多线程安全
     * 效率很低,99% 情况下不需要同步。
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     */
    /*
     private static SingleBean singleBean;
    private SingleBean(){

    }
    public synchronized static SingleBean getInstance(){
        if(singleBean==null){
            singleBean=new SingleBean();
        }
        return singleBean;
    }
    */
    /*
     * 饿汉式 基于 classloder 机制
     * 非Lazy初始化
     * 多线程安全
     * 容易产生垃圾对象
     * 优点：没有加锁，执行效率会提高。
     *缺点：类加载时就初始化，浪费内存
     */
    /*
    private static  SingleBean singleBean=new SingleBean();
    private SingleBean(){

    }
    public static SingleBean getInstance(){
        return singleBean;
    }
    */
     /*
     * DCL 双重校检锁
     * Lazy初始化
     * 多线程安全
     * 双锁机制，安全且在多线程情况下能保持高性能。
     */
     /*
     private volatile static SingleBean singleBean;
     private SingleBean(){}
     public static SingleBean getInstance(){
         if(singleBean==null){
             synchronized (SingleBean.class){
                 if(singleBean==null){
                     singleBean=new SingleBean();
                 }
             }
         }
         return singleBean;
     }
    */
      /*
     * 登记式/静态内部类
     * Lazy初始化
     * 多线程安全
     * 适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
     */

         private static  class SingletonHolder{
             private static final SingleBean singleBean=new SingleBean();
       }
       private SingleBean(){}
       public static final SingleBean getInstance(){
           return SingletonHolder.singleBean;
       }


}
