package DesignPattern.ProducerConsumerPattern;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by john on 2018/1/23.
 */
public class Consumer implements Runnable{
    private BlockingQueue<PCData> queue;
    public static final int  SLEEPTIME=100;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id = " + Thread.currentThread().getId());
        Random random=new Random();
        try{
            while (true) {
                PCData data = queue.take();
                if (null != data) {
                    int result = data.getIntData() * data.getIntData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", data.getIntData(), data.getIntData(), result));
                    Thread.sleep(random.nextInt(SLEEPTIME));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
