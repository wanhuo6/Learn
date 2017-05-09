package com.ahuo.toos.utils;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;

/**
 * Created on 17-5-9
 *
 * @author liuhuijie
 */

public class StringUtils {

    public static final int STRING_TYPE_START = 0;
    public static final int STRING_TYPE_MIDDLE = 1;
    public static final int STRING_TYPE_END = 2;
    public static final int STRING_TYPE_TWO_PART = 3;

    /**
     * 小数点后面的数字变小
     * @param number
     * @param after
     * @return
     */

    public static  Spanned changePointSize(String number,String after){
        if (number==null){
            return null;
        }
        if (number.contains(".")){
            String a[]=number.split("\\.");
            if (a.length>1){
                String source = "<big>" + a[0] + "</big>" +"."+ a[1]+after;
                return Html.fromHtml(source);
            }

        }
        return Html.fromHtml(number);
    }

    /**
     * 改变部分字体颜色
     *
     * @param str
     * @param color
     * @return
     */
    public static Spanned ChangeColor(String str, String color, int type) {
        Spanned temp = null;
        if (str.contains("%")) {
            str = parseContent(str);//增加解析换行
            String[] a = str.split("%");
            switch (type) {
                case STRING_TYPE_START: {
                    String source = "<font color=" + color + ">" + a[0] + "</font>" + a[1];
                    temp = Html.fromHtml(source);
                    break;
                }
                case STRING_TYPE_MIDDLE: {
                    String source = a[0] + "<font color=" + color + ">" + a[1] + "</font>" + a[2];
                    temp = Html.fromHtml(source);
                    break;
                }
                case STRING_TYPE_END: {
                    String source = a[0] + "<font color=" + color + ">" + a[1] + "</font>";
                    temp = Html.fromHtml(source);
                    break;
                }
                case STRING_TYPE_TWO_PART:{
                    String source = a[0] + "<font color=" + color + ">" + a[1] + "</font>" + a[2] + "<font color=" + color + ">" + a[3] + "</font>" + a[4];
                    temp = Html.fromHtml(source);
                    break;
                }
                default:
                    temp = Html.fromHtml(str);
                    break;
            }
        } else {
            temp = Html.fromHtml(str);
        }
        return temp;
    }
    public static String parseContent(String content) {
        if(!TextUtils.isEmpty(content)){
            content = content.replace("\n","<br/>");
        }
        return content;
    }
}
