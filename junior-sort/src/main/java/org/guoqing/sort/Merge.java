package org.guoqing.sort;

import org.guoqing.sort.template.MergeTemplate;

/**
 * @author guoqing
 * @since ： 2019/1/13 16:07
 */
public class Merge implements MergeTemplate {
    private static Comparable[] aux;

    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}

