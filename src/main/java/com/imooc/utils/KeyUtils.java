package com.imooc.utils;

import java.util.Random;

/**
 * id唯一码生成工具类
 */
public class KeyUtils {

    public static String getUniqueKey(){
        Random random = new Random();
        Integer key = random.nextInt(9000000) + 1000000;

        return key + String.valueOf(System.currentTimeMillis());
    }
}
