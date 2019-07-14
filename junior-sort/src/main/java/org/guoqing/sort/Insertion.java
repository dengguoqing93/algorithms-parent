package org.guoqing.sort;

import org.guoqing.template.Example;

/**
 * 插入排序
 *
 * @author guoqing
 * @since ： 2019/1/13 15:11
 */
public class Insertion extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i;j>0&&less(a[j],a[j-1]);j--) {
                exch(a,j,j-1);
            }
        }
    }
}
