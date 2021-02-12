package com.book.jksj.mssftg40j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description ������������֮�� ���������ҳ� ��ΪĿ��ֵ ���� ���� ���������������ǵ������±�
 * @CreateDate 2021\1\27 0027 14:06
 * @Author z
 * @Version 1.0
 */
public class TwoSum {
    /**
     * @Description �����ƽ�
     * @Author z
     * @Date 2021\1\27 0027 15:25
     * @Param [nums, target]
     * @Return int[]
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * @Description hashmapʵ��
     * @Author z
     * @Date 2021\1\27 0027 15:31
     * @Param [nums, target]
     * @Return int[]
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    private int getIndex(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new TwoSum().twoSum(new int[]{1, 9}, 10);
        System.out.println(ints.toString());
    }
}