package DesignPattern.FuturePattern;

/**
 * Created by john on 2018/1/23.
 * 核心思想：异步调用
 *
 */
public class Client {
    public static void main(String[] args) {
        Client client=new Client();
        Data data=client.request("name");
        System.out.println("请求完毕");
        try{
            //模拟处理其他业务流程
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("数据 = " + data.getResult());
    }
    public Data request(final String queryStr){
        final FutureData futureData=new FutureData();
        new Thread(){
            @Override
            public void run() {

                RealData realData=new RealData(queryStr);
                futureData.setRealData(realData);
            }
        }.start();
        return futureData;
    }
}
