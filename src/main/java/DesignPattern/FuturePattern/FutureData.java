package DesignPattern.FuturePattern;

/**
 * Created by john on 2018/1/23.
 * 关键
 * RealData的代理 封装获取RealData的等待过程
 */
public class FutureData implements Data{
    protected RealData realData=null;
    protected boolean isReady=false;
    public synchronized void setRealData(RealData realData){
        if (isReady) {
            return;
        }
        this.realData=realData;
        isReady=true;
        notifyAll();
    }
    @Override
    public String getResult() {
        while (!isReady) {
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return realData.result;

    }
}
