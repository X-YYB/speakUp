package com.young.regularExpression;

/**
 * @Description: TODO
 * @Author: yangyb
 * @Date:2022/7/11 23:08
 * Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        String regular="22\\d\\d";
        System.out.println("2236".matches(regular));
        System.out.println("2136".matches(regular));
    }
}
