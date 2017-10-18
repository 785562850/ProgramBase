package AlgorithmBase.Sort;

import java.util.List;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public void sort(List<Num> nums){

        int m=1;
        for(int i=0;i<nums.size();i++){
            if(m==0){
                break;
            }
            m=0;
            for(int j=0;j<nums.size()-1-i;j++){
                if(nums.get(j).getValue()>nums.get(j+1).getValue()){
                    swap(nums.get(j),nums.get(j+1));
                    m=1;
                }
            }
        }
    }
    public void swap(Num num1,Num num2){
        int temp=num1.getValue();
        num1.setValue(num2.getValue());
        num2.setValue(temp);
    }
}
