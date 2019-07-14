package org.guoqing.template;

import javax.swing.text.AbstractDocument;

/**
 * 排序算法的模板类
 *
 * @author guoqing
 * @since ： 2019/1/13 14:08
 */
public abstract class Example {
    public abstract void sort(Comparable[] a);
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }

    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

}
