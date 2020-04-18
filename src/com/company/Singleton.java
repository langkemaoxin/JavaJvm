package com.company;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author GY.C
 * @Date 2020/4/10 22:42
 * @Version 1.0
 */
public class Singleton {
    private volatile static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
