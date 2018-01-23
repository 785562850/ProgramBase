package DataStructure.List;

import java.util.List;

/**
 * Created by john on 2017/10/3.
 */
public class LinkedList extends AbstractList{
    int current_length=0;

    public LinkedList() {
    }

    protected LinkedList(Data[] datas) {
        List<Integer> s=new java.util.LinkedList<Integer>();
        int i=0;

        this.datas[0].setNext(1);
        this.datas[0].setValue(datas[0].getValue());
       for(int j=1;j<datas.length;j++){
           this.datas[i].setPre(i-1);
           this.datas[i].setValue(datas[i].getValue());
           this.datas[i].setNext(i+1);
       }
       current_length=datas.length;
    }

    @Override
    public boolean set(int index, Data data) {
        if(index>current_length){
            current_length=index;
        }
        datas[index].setValue(data.getValue());

        return true;
    }

    @Override
    public boolean add(Data data) {
        if(current_length<MAX_INDEX) {
            datas[current_length] = data;
            datas[current_length].setPre(current_length - 1);
            datas[current_length].setNext(current_length++);
        }else {
            throw new IndexOutOfBoundsException("列表最大长度为："+MAX_INDEX);
        }
        return true;
    }
    public boolean add(int index,Data data) {
        if(current_length<MAX_INDEX) {
            if(index<current_length) {
                datas[current_length] = data;
                datas[current_length].setPre(index - 2);
                datas[current_length].setNext(index - 1);
                datas[index - 1].setPre(current_length);
                datas[index - 2].setNext(current_length);
            }
        }else {
            throw new IndexOutOfBoundsException("列表最大长度为："+MAX_INDEX);
        }
        return true;
    }
    @Override
    public boolean remove(int index) {
        if(index<MAX_INDEX){
        datas[index-2].setNext(index);
        datas[index].setPre(index-2);
        datas[index-1]=datas[current_length--];
        datas[index-1].setNext(current_length);
        datas[current_length]=null;
        }else {
            throw new IndexOutOfBoundsException("列表最大长度为："+MAX_INDEX);
        }
        return true;
    }

    @Override
    public Data get(int index) {
        if(index>=MAX_INDEX){
            throw new IndexOutOfBoundsException("列表最大长度为："+MAX_INDEX);
        }
        return datas[index-1];
    }

    @Override
    public boolean hasNext() {
        return super.hasNext();
    }


}
