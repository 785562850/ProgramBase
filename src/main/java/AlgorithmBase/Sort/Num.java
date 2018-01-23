package AlgorithmBase.Sort;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by john on 2017/10/4.
 */
public class Num implements Cloneable{
    private int value;

    public Num() {
    }

    public Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void swap(Num num2){
        int temp=this.getValue();
        this.setValue(num2.getValue());
        num2.setValue(temp);
    }

    @Override
    public Object clone() {
        Num o = null;
        try {
            o = (Num) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
    public static List<Num> deepCopy(List<Num> src) {
        List<Num> copy = new LinkedList<Num>();
        for (int i = 0; i < src.size(); i++) {
            copy.add((Num) src.get(i).clone());
        }
        return copy;
    }

}
