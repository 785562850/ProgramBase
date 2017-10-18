package DataStructure.List;


/**
 * Created by john on 2017/10/3.
 */
public class ArraryList extends AbstractList{
        @Override
        public boolean add(Data data) {
                if(current_index!=100) {
                        datas[current_index++] = data;
                        return true;
                }else {
                        throw new IndexOutOfBoundsException("列表最大长度为：100");
                }

        }

        @Override
        public boolean set(int index, Data data) {
                if(index<MAX_INDEX) {
                        datas[index] = data;
                }else {
                        throw new IndexOutOfBoundsException("列表最大长度为：100");
                }
                return true;
        }

        @Override
        public boolean remove(int index) {
                if(index<MAX_INDEX) {
                        datas[index] = null;
                }else {
                        throw new IndexOutOfBoundsException("列表最大长度为：100");
                }
                return true;
        }

        @Override
        public Data get(int index) {
                if(index>=MAX_INDEX){
                        throw new IndexOutOfBoundsException("列表最大长度为：100");
                }
                return datas[index];
        }
}
