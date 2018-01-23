package DesignPattern.FuturePattern;

/**
 * Created by john on 2018/1/23.
 */
public class RealData implements Data{
    protected final String result;

    public RealData(String para) {
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

        result= stringBuffer.toString();

    }

    @Override
    public String getResult() {
        return result;
    }
}
