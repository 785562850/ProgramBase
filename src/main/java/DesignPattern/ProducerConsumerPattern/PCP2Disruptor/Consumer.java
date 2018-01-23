package DesignPattern.ProducerConsumerPattern.PCP2Disruptor;

import com.lmax.disruptor.WorkHandler;

/**
 * Created by john on 2018/1/23.
 */
public class Consumer implements WorkHandler<PCData>{
    @Override
    public void onEvent(PCData pcData) throws Exception {
        System.out.println(Thread.currentThread().getId() + ":Event: --" + pcData.getValue() * pcData.getValue() + "--");
    }
}
