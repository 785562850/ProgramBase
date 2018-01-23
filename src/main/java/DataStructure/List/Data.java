package DataStructure.List;


/**
 * Created by john on 2017/10/3.
 */
public class Data {
    private int pre;
    private int next;
    private String value;

    public Data() {
    }

    public Data(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
