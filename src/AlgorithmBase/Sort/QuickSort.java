package AlgorithmBase.Sort;

import DataStructure.List.ArraryList;

import java.util.List;
import java.util.Random;

/**
 * 快速排序
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
            if(low<high)
           swap(nums.get(low),nums.get(high));
        }
        swap(nums.get(temp),nums.get(low));
        return low;

    }
    public void swap(Num num1,Num num2){
        int temp=num1.getValue();
        num1.setValue(num2.getValue());
        num2.setValue(temp);
    }
}
