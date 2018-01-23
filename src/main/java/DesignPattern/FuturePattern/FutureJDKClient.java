package DesignPattern.FuturePattern;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by john on 2018/1/23.
 * 基于JDKFuture
 */
public class FutureJDKClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask=new FutureTask<String>(new RealData2JDK("a"));
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        executorService.submit(futureTask);
        System.out.println("请求完毕");
        try{
            //模拟处理其他业务流程
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("数据 = " +futureTask.get());
    }
}
