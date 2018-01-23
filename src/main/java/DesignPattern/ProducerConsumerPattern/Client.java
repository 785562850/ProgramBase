package DesignPattern.ProducerConsumerPattern;

import java.util.concurrent.*;

/**
 * Created by john on 2018/1/23.
 * 生产者/消费者 模式 基于BlockingQueue 使用锁和堵塞等待来实现线程间的同步
 * 高并发环境下 性能不是特别优越 可使用CAS来实现生产者/消费者模式
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<PCData> queue=new LinkedBlockingQueue<PCData>(10);
        Producer producer1=new Producer(queue);
        Producer producer2=new Producer(queue);
        Producer producer3=new Producer(queue);
        Consumer consumer1=new Consumer(queue);
        Consumer consumer2=new Consumer(queue);
        Consumer consumer3=new Consumer(queue);
        ExecutorService service= Executors.newCachedThreadPool();
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer1);
        service.execute(consumer2);
        service.execute(consumer3);
        Thread.sleep(10*1000);
        producer1.stop();
        producer2.stop();
        producer3.stop();
        Thread.sleep(3000);
        service.shutdown();

    }
}
