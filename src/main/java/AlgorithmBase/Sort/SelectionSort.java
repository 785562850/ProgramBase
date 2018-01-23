package AlgorithmBase.Sort;

import java.util.List;

/**
 * 选择排序
 * 算法步骤： 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *          2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *          3.重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public void sort(List<Num> nums,String type) throws Exception {
        if("DESC".equalsIgnoreCase(type)){
            descSort(nums);
        }else if("ASC".equalsIgnoreCase(type)){
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
                nums.get(i).swap(nums.get(min));
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
              nums.get(i).swap(nums.get(max));
            }
        }
    }

}
