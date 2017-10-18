package AlgorithmBase.Sort;

import java.util.List;

/**
 * 插入排序
 */
public class InsertSort {
    public void sort(List<Num> nums){
        for(int i=1;i<nums.size();i++){

        }
    }
    public void swap(Num num1,Num num2){
        int temp=num1.getValue();
        num1.setValue(num2.getValue());
        num2.setValue(temp);
    }
}
