package AlgorithmBase.Sort;

import java.util.List;

/**
 * 堆排序
 * 基本原理：堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 * 算法步骤： 1.创建一个堆H[0..n-1]
 *          2.把堆首（最大值）和堆尾互换
 *          3.把堆的尺寸缩小1，并调用shift_down(0),目的是把新的数组顶端数据调整到相应位置。
 *          4.重复步骤2，直到堆的尺寸为1
 */
public class HeapSort {
    public void sort(List<Num> nums){
//末尾与头交换，交换后调整最大堆
        buildMaxHeapify(nums);
        for(int i=nums.size()-1;i>0;i--){

            nums.get(i).swap(nums.get(0));
            maxHeapify(nums,i,0);
        }
    }
    private static void buildMaxHeapify(List<Num> nums){
//没有子节点的才需要创建最大堆，从最后一个的父节点开始
        int startIndex=getParentIndex(nums.size()-1);
//从尾端开始创建最大堆，每次都是正确的堆
        for(int i=startIndex;i>=0;i--){
            maxHeapify(nums,nums.size(),i);
        }
    }

    /**
     *创建最大堆
     *
     *@paramdata
     *@paramheapSize需要创建最大堆的大小，一般在sort的时候用到，因为最多值放在末尾，末尾就不再归入最大堆了
     *@paramindex当前需要创建最大堆的位置
     */
    private static void maxHeapify(List<Num> nums,int heapSize,int index){
//当前点与左右子节点比较
        int left=getChildLeftIndex(index);
        int right=getChildRightIndex(index);

        int largest=index;
        if(left<heapSize&&nums.get(index).getValue()<nums.get(left).getValue()){
            largest=left;
        }
        if(right<heapSize&&nums.get(largest).getValue()<nums.get(right).getValue()){
            largest=right;
        }
//得到最大值后可能需要交换，如果交换了，其子节点可能就不是最大堆了，需要重新调整
        if(largest!=index){
            nums.get(index).swap(nums.get(largest));
            maxHeapify(nums,heapSize,largest);
        }
    }
    /**
     *父节点位置
     *
     *@paramcurrent
     *@return
     */
    private static int getParentIndex(int current){
        return(current-1)>>1;
    }

    /**
     *左子节点position注意括号，加法优先级更高
     *
     *@paramcurrent
     *@return
     */
    private static int getChildLeftIndex(int current){
        return(current<<1)+1;
    }

    /**
     *右子节点position
     *
     *@paramcurrent
     *@return
     */
    private static int getChildRightIndex(int current){
        return(current<<1)+2;
    }

}
