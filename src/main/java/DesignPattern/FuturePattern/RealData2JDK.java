package DesignPattern.FuturePattern;

import java.util.concurrent.Callable;

/**
 * Created by john on 2018/1/23.
 * 基于JDKFuture FutureTask实例
 */
public class RealData2JDK implements Callable<String>{
    private String para;

    public RealData2JDK(String para) {
        this.para = para;
    }

    @Override
    public String call() throws Exception {
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(para);
            //模拟耗时操作
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return stringBuffer.toString();
    }
}
