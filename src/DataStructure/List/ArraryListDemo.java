package DataStructure.List;

/**
 * Created by john on 2017/10/3.
 */
public class ArraryListDemo {
    public static void main(String[] args) {
        ArraryList arraryList=new ArraryList();
        for (int i=0;i<100;i++) {
            Data data = new Data(String.valueOf(i));
            arraryList.add(data);
        }
        for (int i=0;i<100;i++) {
           System.out.println(arraryList.get(i).getValue());
        }
    }
}
