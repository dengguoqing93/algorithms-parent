package org.guoqing.sort;

import org.guoqing.sort.template.Example;

/**
 * 希尔排序
 *
 * @author guoqing
 * @since ： 2019/1/13 15:42
 */
public class Shell extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h > 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
