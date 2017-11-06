package AlgorithmBase.Sort;

import java.util.List;

/**
 * 基数排序
 * 基本原理：将整数按位数切割成不同的数字，然后按每个位数分别比较
 */
public class RadixSort {
    public void sort(List<Num> nums) {
        int k = 0;
        int n = 1;
        int m = 1; //控制键值排序依据在哪一位
        int[][] temp = new int[10][nums.size()]; //数组的第一维表示可能的余数0-9
        int[] order = new int[10]; //数组orderp[i]用来表示该位是i的数的个数
        int max = nums.get(0).getValue();
        for (Num num : nums) {
            if (num.getValue() > max) {
                max = num.getValue();
            }
        }
        while (m <= String.valueOf(max).length()) {
            for (int i = 0; i < nums.size(); i++) {
                int lsd = ((nums.get(i).getValue() / n) % 10);
                temp[lsd][order[lsd]] = nums.get(i).getValue();
                order[lsd]++;
            }
            for (int i = 0; i < 10; i++) {
                if(order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        nums.get(k).setValue(temp[i][j]);
                        k++;
                    }

                }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
            m++;

        }
    }
}
