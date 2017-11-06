package AlgorithmBase.Sort;

import java.util.List;

/**
 * 冒泡排序
 * 基本思想：它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 *          走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成
 * 算法步骤： 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *          2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *          3.针对所有的元素重复以上的步骤，除了最后一个。
 *          4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
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
                    nums.get(j).swap(nums.get(j+1));
                    m=1;
                }
            }
        }
    }

}
