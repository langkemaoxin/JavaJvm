package com.company;

/**
 * @ClassName ConstClass
 * @Description TODO
 * @Author GY.C
 * @Date 2020/4/16 23:09
 * @Version 1.0
 */
public class ConstClass {
    static {
        System.out.println("ConstClass Init");
    }

    public static final String HELLEMETHOD="hello world";
}

class NotInitialization{
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLEMETHOD);
    }
}
