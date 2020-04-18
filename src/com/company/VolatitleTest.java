package com.company;

/**
 * @ClassName VolatitleTest
 * @Description TODO
 * @Author GY.C
 * @Date 2020/4/10 21:37
 * @Version 1.0
 */
public class VolatitleTest {
    public static volatile int race=0;
    public static void increase(){
        race++;
    }

    private static final int ThreadCount=20;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[ThreadCount];
        for (int i = 0; i < ThreadCount; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        Thread.sleep(3000);

        System.out.println(race);
    }

}
