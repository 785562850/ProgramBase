package AlgorithmBase.Sort;

import java.io.IOException;
import java.util.*;

/**
 * Created by john on 2017/10/4.
 */
public class Client {
   public static void main(String[] args){
       List<Num> nums=new ArrayList<Num>();
       for(int i=0;i<10;i++){
           Random r=new Random();
           nums.add(new Num(r.nextInt(100)));
       }
       for (Num num:nums){
           System.out.print(num.getValue()+" ");
       }
       HeapSort heapSort=new HeapSort();
       heapSort.sort(nums);
       /*RadixSort radixSort=new RadixSort();
       radixSort.sort(nums);*/
        /*CountingSort countingSort=new CountingSort();
       countingSort.sort(nums);*/
       /* HeapSort heapSort=new HeapSort();
       heapSort.sort(nums);*/
      /* MergeSort mergeSort=new MergeSort();
        mergeSort.sort(nums);*/
      /* ShellSort shellSort=new ShellSort();
       shellSort.sort(nums);*/
       /* InsertSort insertSort=new InsertSort();
       insertSort.sort(nums);*/
      /* QuickSort quickSort=new QuickSort();
       quickSort.sort(nums);*/
       /*BubbleSort bubbleSort=new BubbleSort();
       bubbleSort.sort(nums);*/
       /*SelectionSort selectionSort=new SelectionSort();
       try {
           selectionSort.sort(nums,"DESC");
       } catch (Exception e) {
           e.printStackTrace();
       }*/
        /* try {
           selectionSort.sort(nums,"ASC");
       } catch (Exception e) {
           e.printStackTrace();
       }*/
       System.out.println();
       for (Num num:nums){
           System.out.print(num.getValue()+" ");
       }



   }
}
