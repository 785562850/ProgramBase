package AlgorithmBase.Sort;

import java.util.List;

/**
 * 希尔排序(插入排序改进版)
 * 非稳定排序算法
 * 基本思想：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 *          待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
 * 算法步骤： 1.选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 *          2.按增量序列个数k，对序列进行k 趟排序；
 *          3.每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {
    public void sort(List<Num> nums){
        Num temp=new Num();
         int k=0;
        for(int i=nums.size()/2;i>0;i/=2){
              for(int j=i;j<nums.size();j++){
                temp.setValue(nums.get(j).getValue());
                k=j;
                while(k>=i&&nums.get(k-i).getValue()>temp.getValue()){
                    nums.get(k).setValue(nums.get(k-i).getValue());
                    k-=i;
                }
                nums.get(k).setValue(temp.getValue());
              }
          }
    }
}
