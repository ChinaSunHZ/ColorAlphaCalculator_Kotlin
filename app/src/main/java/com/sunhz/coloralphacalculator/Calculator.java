package com.sunhz.coloralphacalculator;

/**
 * 计算ARGB颜色透明度A值
 * Created by Spencer on 15/4/10.
 */
public class Calculator {
    public static String calculator(String numStr) {
        int num = Integer.parseInt(numStr);
        if (num > 255) num = 255;
        else if (num < 0) num = 0;
        return Integer.toHexString(num).toUpperCase();
    }
}
