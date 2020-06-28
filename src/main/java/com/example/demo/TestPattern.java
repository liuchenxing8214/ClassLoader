package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

    public static void main(String[] args) {
        System.out.println(isContainAnyPunctuation("111"));
        System.out.println(isContainAnyPunctuation("11@1"));
        System.out.println(isContainAnyPunctuation("11!1"));
        System.out.println(isContainAnyPunctuation("11==1"));
    }
    public static boolean isContainAnyPunctuation(String str) {
        Pattern patPunctuation = Pattern.compile("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]");

        Matcher matcher = patPunctuation.matcher(str);
        return matcher.find();
    }

}
