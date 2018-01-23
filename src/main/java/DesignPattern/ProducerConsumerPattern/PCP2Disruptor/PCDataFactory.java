package DesignPattern.ProducerConsumerPattern.PCP2Disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * Created by john on 2018/1/23.
 */
public class PCDataFactory implements EventFactory<PCData>{
    @Override
    public PCData newInstance() {
        return new PCData();
    }
}
