package AlgorithmBase.Sort;

import DataStructure.List.ArraryList;

import java.util.List;
import java.util.Random;

/**
 * 快速排序
 * 算法步骤： 1.从数列中挑出一个元素，称为 “基准”（pivot），
 *          2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 *            在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作
 *          3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 */
public class QuickSort {
    public void sort(List<Num> nums){
        Random random=new Random();
        int index=random.nextInt(nums.size()-1);
        quickSort(nums,0,index-1);
        quickSort(nums,index+1,nums.size()-1);
    }
    public void quickSort(List<Num> nums,int  low,int high){
        if(low>high){
            return;
        }
        int middle=spilt(nums,low,nums.size()-1);
        quickSort(nums,low,middle-1);
        quickSort(nums,middle+1,high);
    }
    public int spilt(List<Num> nums,int  low,int high){
        int temp=low;
        Num tnum=nums.get(low);
        while(low!=high) {
            while (low < high && tnum.getValue() <= nums.get(high).getValue()) {
                high--;
            }
            while (low < high && nums.get(low).getValue() <= tnum.getValue()) {
                low++;
            }
            if(low<high) {
                nums.get(low).swap( nums.get(high));
            }
        }
        nums.get(temp).swap(nums.get(low));
        return low;

    }

}
