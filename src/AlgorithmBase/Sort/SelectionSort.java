package AlgorithmBase.Sort;

import java.util.List;

/**
 * 选择排序
 */
public class SelectionSort {
    public void sort(List<Num> nums,String type) throws Exception {
        if(type.equalsIgnoreCase("DESC")){
            descSort(nums);
        }else if(type.equalsIgnoreCase("ASC")){
            ascSort(nums);
        }else {
            throw new Exception("排序类型指定错误");
        }
    }
    /**
     * 升序
     * @param nums
     */
    public void ascSort(List<Num> nums){
        int min=0;
        for (int i=0;i<nums.size();i++) {
            min=i;
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(min).getValue() > nums.get(j).getValue()) {
                    min = j;
                }
            }
            if(min!=i) {
                swap(nums.get(i), nums.get(min));
            }
        }
    }

    /**
     * 降序
     * @param nums
     */
    public void descSort(List<Num> nums){
        int max=0;
        for (int i=0;i<nums.size();i++) {
            max=i;
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(max).getValue() < nums.get(j).getValue()) {
                    max = j;
                }
            }
            if(max!=i) {
                swap(nums.get(i), nums.get(max));
            }
        }
    }
    public void swap(Num num1,Num num2){
        int temp=num1.getValue();
        num1.setValue(num2.getValue());
        num2.setValue(temp);
    }
}
