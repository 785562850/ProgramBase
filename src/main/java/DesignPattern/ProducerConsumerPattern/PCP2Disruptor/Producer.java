package DesignPattern.ProducerConsumerPattern.PCP2Disruptor;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * Created by john on 2018/1/23.
 */
public class Producer {
    private final RingBuffer<PCData> ringBuffer;

    public Producer(RingBuffer<PCData> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }
    public void pushData(ByteBuffer bb){
        long sequence=ringBuffer.next();
        try {
            PCData event = ringBuffer.get(sequence);
            event.setValue(bb.getLong(0));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ringBuffer.publish(sequence);
        }
    }
}
