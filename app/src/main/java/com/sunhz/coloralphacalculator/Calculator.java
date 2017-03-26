package com.sunhz.coloralphacalculator;

/**
 * Calculator
 * Created by Spencer on 15/4/10.
 */
public class Calculator {

    public static String calculator(int percentage) {

        if (percentage > 100) {
            percentage = 100;
        } else if (percentage < 0) {
            percentage = 0;
        }

        int result = percentage * 255 / 100;

        return Integer.toHexString(result).toUpperCase();
    }
}
