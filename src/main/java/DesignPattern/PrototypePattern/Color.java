package DesignPattern.PrototypePattern;

import java.io.Serializable;

/**
 * Created by john on 2017/10/1.
 */
public abstract class Color implements Serializable{
    private String color;

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void fill(){
        System.out.println("I'm "+getColor()+"!");
    }
}
