package org.guoqing.sort;

import org.guoqing.template.Example;

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
                exch(a, i, min);
            }
        }
    }
}
