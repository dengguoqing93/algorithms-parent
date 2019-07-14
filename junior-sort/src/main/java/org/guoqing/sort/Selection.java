package org.guoqing.sort;

import org.guoqing.sort.template.Example;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author guoqing
 * @since ： 2019/1/13 14:27
 */
public class Selection extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exchange(a, i, min);
            }
        }
    }

}
