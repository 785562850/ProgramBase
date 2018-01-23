package AlgorithmBase.Sort;

import java.util.List;

/**
 * 插入排序
 * 基本思想：构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 性质：插入排序在对几乎已经排好序的数据操作时， 效率高， 即可以达到线性排序的效率
 *      但插入排序一般来说是低效的， 因为插入排序每次只能将数据移动一位
 * 算法步骤：
 * 1.将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 2.从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort {
    public void sort(List<Num> nums){
        int temp=0;
        boolean flag=true;
        for(int i=1;i<nums.size();i++){
            temp=i;
            flag=true;

           for(int j=i-1;j>=0;j--){
               if(!flag){
                  break;
               }
               if(nums.get(temp).getValue()<nums.get(j).getValue()){
                   nums.get(temp).swap(nums.get(j));
                   temp=j;
               }else {
                   flag=false;
               }
           }

        }
    }

}
