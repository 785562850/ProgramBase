package DesignPattern.ProducerConsumerPattern.PCP2Disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by john on 2018/1/23.
 *
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        PCDataFactory factory = new PCDataFactory();
        int buffSize = 1024;
        Disruptor<PCData> disruptor = new Disruptor<PCData>(factory, buffSize,
                threadFactory, ProducerType.MULTI, new BlockingWaitStrategy());//默认 等待策略
        disruptor.handleEventsWithWorkerPool(new Consumer(),new Consumer(),new Consumer(),new Consumer());
        disruptor.start();
        RingBuffer<PCData> ringBuffer=disruptor.getRingBuffer();
        Producer producer=new Producer(ringBuffer);
        ByteBuffer bb=ByteBuffer.allocate(8);
        for(long l=0;true;l++){
            bb.putLong(0,l);
            producer.pushData(bb);
            Thread.sleep(100);
            System.out.println("add data " + l);
        }
    }

}

