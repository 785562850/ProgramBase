package DesignPattern.BridgePattern;

/**
 * Created by john on 2017/10/2.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();
}
