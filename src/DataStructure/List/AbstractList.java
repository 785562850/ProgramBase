package DataStructure.List;

/**
 * Created by john on 2017/10/3.
 */
public abstract class AbstractList {
    protected static int MAX_INDEX=100;
    protected Data[] datas=new Data[MAX_INDEX];
    protected  int current_index=0;

    public AbstractList() {
    }

    protected AbstractList(Data[] datas) {
        int i=0;
        for (Data data:datas) {
            this.datas[i++]=data;
        }
    }
    public abstract boolean set(int index,Data data);
    public abstract boolean add(Data data);
    public  abstract  boolean remove(int index);
    public abstract Data get(int index);

    public boolean hasNext(){
        if(current_index<MAX_INDEX-1){
            return true;
        }
        return false;
    }

}
