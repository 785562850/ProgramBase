package DesignPattern.ProducerConsumerPattern;

/**
 * Created by john on 2018/1/23.
 */
public final class PCData {
    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }
    public PCData(String d) {
        this.intData = Integer.valueOf(d);
    }

    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "data: "+intData;
    }
}
