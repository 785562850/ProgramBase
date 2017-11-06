package DesignPattern.AdapterPattern;

/**
 * 适配器模式 结构型模式
 * 实现方式：适配器继承或依赖已有的对象，实现想要的目标接口
 *   需要被适配的类、接口、对象（我们有的），简称 src（source）
 *   最终需要的输出（我们想要的），简称 dst (destination，即Target)
 *   适配器称之为 Adapter 。
 *    src->Adapter->dst
 *    类适配器模式（单继承机制）：Adapter类，通过继承 src类，实现 dst 类接口，完成src->dst的适配。
 *    对象适配器模式：Adapter类，持有 src类，实现 dst 类接口，完成src->dst的适配
 *    接口适配器模式：Adapter类，src作为接口实现
 * 作为两个不兼容的接口之间的桥梁，结合了两个独立接口的功能
 * 解决问题：解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的
 * 使用场景： 1、系统需要使用现有的类，而此类的接口不符合系统的需要。
 *          2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
 *          3、通过接口转换，将一个类插入另一个类系中。
 * 实例：1.JAVA JDBC  2.Enumeration 接口,Iterator 接口 接口转换
 * 优点： 1、可以让任何两个没有关联的类一起运行。
 *       2、提高了类的复用。
 *       3、增加了类的透明度。
 *       4、灵活性好。
 * 缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 *      2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类
 * 注意：适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
