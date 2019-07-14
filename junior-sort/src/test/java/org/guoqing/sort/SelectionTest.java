package org.guoqing.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * 选择排序测试类
 *
 * @author guoqing
 * @since ： 2019/7/14 20:46
 */
public class SelectionTest {

    @Test
    public void sort() {
        String s = "sortexample";
        Selection selection = new Selection();
        String[] split = s.split("");
        selection.sort(split);
        String result = Arrays.toString(split);
        String except = "[a, e, e, l, m, o, p, r, s, t, x]";
        assertEquals("排序后字符串",except,result);
    }
}