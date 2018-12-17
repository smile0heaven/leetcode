package com.example.kqc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yq
 * Date  on : 2018/8/6
 * 给定两个数组，写一个方法来计算它们的交集。
 * <p>
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * <p>
 * 注意：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 跟进:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Class6 {
    //思路 先对两个数组进行排序，后循环，循环过程中如果1>2那么2+1如果1<2那么1+1
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = new int[nums2.length];
        if (nums2.length == 0 || nums1.length == 0) return new int[]{};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int point = 0;
        int start = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = start; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    res[point++] = nums2[i];
                    start = ++j;
                    break;
                } else if (nums2[i] < nums1[j]) {
                    start = j;
                    break;
                }
            }
        }
        if (point == 0) {
            return new int[]{};
        } else {
            int[] result = Arrays.copyOfRange(res, 0, point);
            return result;
        }

    }
    //思路 先把数组1的值作为key放入map中，然后遍历nums2找map数组是否含有，有就插入数组中
    public int[] intersects(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums1) {
            int num = map.get(n) != null ? map.get(n) : 0;
            map.put(n, num + 1);
        }
        for (int n : nums2) {
            int num = map.get(n) != null ? map.get(n) : 0;
            if (num != 0) {
                res.add(n);
                map.put(n, num - 1);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;


    }
}
