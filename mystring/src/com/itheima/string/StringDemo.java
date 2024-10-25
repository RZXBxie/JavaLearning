package com.itheima.string;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class StringDemo {
    public static void main(String[] args) {
        /*
        String s = "Xiefeng6558";
        countDifferentLetterTypes
         */


        /*
        int number = 2135;
        String num = digitToChinese(number);
        System.out.println(num);
        */

    }

    /**
     * 一个将七位数字转为中文大写的方法，如2135——>零佰零拾零万贰仟壹佰叁拾伍元
     * @param number 传入的待转换的数字
     * @return 转换后的字符串
     */
    public static String digitToChinese(int number) {
        char[] map = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        String result = "";
        char[] digits = {'零', '零', '零', '零', '零', '零', '零'};
        char[] unit = {'佰', '拾', '万', '仟', '佰', '拾', '元'};
        int index = 6;
        while (number != 0) {
            digits[index] = map[number % 10];
            number /= 10;
            index--;
        }
        for (int i = 0; i < unit.length; i++) {
            result = result + digits[i] + unit[i];
        }
        return result;
    }

    /**
     * 一个用于统计字符串中大写字母、小写字母和数字字符的方法
     * @param s 传入的待检查的字符串
     */
    public static void countDifferentLetterTypes(String s) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isUpperCase(c)) {
                countUpperCase++;
            } else if (isLowerCase(c)) {
                countLowerCase++;
            } else {
                countDigit++;
            }
        }
        System.out.printf("大写字母个数：%d, 小写字母个数：%d, 数字字符个数：%d", countUpperCase, countLowerCase, countDigit);
    }
}
