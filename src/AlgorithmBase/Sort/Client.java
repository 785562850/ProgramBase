package AlgorithmBase.Sort;

import AlgorithmBase.Sort.BubbleSort;
import AlgorithmBase.Sort.Num;
import AlgorithmBase.Sort.QuickSort;
import AlgorithmBase.Sort.SelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by john on 2017/10/4.
 */
public class Client {
   public static void main(String[] args){
       List<Num> nums=new ArrayList<Num>();
       for(int i=0;i<10;i++){
           Random r=new Random();
           nums.add(new Num(r.nextInt(10)));
       }
       for (Num num:nums){
           System.out.print(num.getValue()+" ");
       }
      /* QuickSort quickSort=new QuickSort();
       quickSort.sort(nums);*/
       /*BubbleSort bubbleSort=new BubbleSort();
       bubbleSort.sort(nums);*/
       SelectionSort selectionSort=new SelectionSort();
       try {
           selectionSort.sort(nums,"DESC");
       } catch (Exception e) {
           e.printStackTrace();
       }
       System.out.println();
       for (Num num:nums){
           System.out.print(num.getValue()+" ");
       }
       try {
           selectionSort.sort(nums,"ASC");
       } catch (Exception e) {
           e.printStackTrace();
       }
       System.out.println();
       for (Num num:nums){
           System.out.print(num.getValue()+" ");
       }

   }
}
