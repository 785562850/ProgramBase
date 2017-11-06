package AlgorithmBase.Sort;

import java.util.LinkedList;
import java.util.List;

/**
 * 计数排序
 * 计算每个数的比该数大的数的个数，根据个数排序
 */
public class CountingSort {
    public void sort(List<Num> nums){
        int[] counts=new int[nums.size()];
        int max = nums.get(0).getValue(),min = nums.get(0).getValue();
        for(Num num:nums){
            if(num.getValue()>max){
                max=num.getValue();
            }
            if(num.getValue()<min){
                min=num.getValue();
            }
        }//这里k的大小是要排序的数组中，元素大小的极值差+1
        int k=max-min+1;
        int c[]=new int[k];
        for(int i=0;i<nums.size();++i){
            c[nums.get(i).getValue()-min]+=1;//优化过的地方，减小了数组c的大小
        }
        for(int i=1;i<c.length;++i){
            c[i]=c[i]+c[i-1];
        }
        for(int i=nums.size()-1;i>=0;--i){
            counts[--c[nums.get(i).getValue()-min]]=nums.get(i).getValue();//按存取的方式取出c的元素
        }
        for (int i=0;i<counts.length;i++){
            nums.get(i).setValue(counts[i]);
        }




    }
}
