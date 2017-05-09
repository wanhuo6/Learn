package com.ahuo.toos.utils;

import java.text.DecimalFormat;

/**
 * Created on 17-5-9
 *
 * @author liuhuijie
 */

public class NumberUtils {

    /**
     * 保留两位小数
     *
     * @param f
     * @return
     */
    public static String DFTwoPont(double f) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(f);
    }

    /**
     * 保留一位小数
     *
     * @param f
     * @return
     */
    public static String DFOnePont(double f) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(f);
    }
    public static String DFOnePont(float f) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(f);
    }
}
