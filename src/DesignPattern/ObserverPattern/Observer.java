package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/2.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();

}
