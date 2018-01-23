package DesignPattern.ProducerConsumerPattern.PCP2Disruptor;

/**
 * Created by john on 2018/1/23.
 */
public class PCData {
    private long value;

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
