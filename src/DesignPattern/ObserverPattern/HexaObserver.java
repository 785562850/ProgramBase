package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/3.
 */
public class HexaObserver  extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
