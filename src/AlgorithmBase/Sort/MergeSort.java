package AlgorithmBase.Sort;

import java.util.List;

/**
 * 合并排序（分治法）
 * 算法步骤： 1.申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 *          2.设定两个指针，最初位置分别为两个已经排序序列的起始位置
 *          3.比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 *          4.重复步骤3直到某一指针达到序列尾
 *          5.将另一序列剩下的所有元素直接复制到合并序列尾
 */
public class MergeSort {
    public void sort(List<Num> nums){
       int length=nums.size();
       int middle=length/2;
       if(length>1) {

           List<Num> leftNums = Num.deepCopy(nums.subList(0,middle));
           List<Num> rightNums =  Num.deepCopy(nums.subList(middle,length));
           sort(leftNums);
           sort(rightNums);
           merge(nums,leftNums,rightNums);
       }

    }

    public void merge(List<Num> nums,List<Num> leftNums,List<Num> rightNums){
        int i=0,l=0,r=0;


        while(l<leftNums.size()&&r<rightNums.size()){

            if(leftNums.get(l).getValue()<rightNums.get(r).getValue()){
                nums.get(i).setValue(leftNums.get(l).getValue());
                i++;
                l++;
            }else{
                nums.get(i).setValue(rightNums.get(r).getValue());
                i++;
                r++;
            }
        }

        while(r<rightNums.size()){//如果右边剩下合并右边的
            nums.get(i).setValue(rightNums.get(r).getValue());
            r++;
            i++;
        }

        while(l<leftNums.size()){
            nums.get(i).setValue(leftNums.get(l).getValue());
            l++;
            i++;
        }

    }
}
